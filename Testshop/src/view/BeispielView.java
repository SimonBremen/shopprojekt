package view;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.http.HttpServletResponse;

import model.BeispielModel;

public class BeispielView {
	
	private HttpServletResponse response;
	private PrintWriter out;
	private ArrayList<BeispielModel> beispielModelArrayList;
	private BeispielModel beispielModel;
	
	
	/**
	 * Konstruktor der Klasse BeispielView. 
	 * @param response
	 * Die HttpServletResponse aus dem Servlet.
	 * @param beispielModel
	 * Das Model, dessen Daten ausgegeben werden sollen.
	 */
	public BeispielView(HttpServletResponse response, ArrayList<BeispielModel> beispielModelArrayList)
	{
		this.response = response; // response entschatten
		
		// PrintWriter erzeugen
		this.response.setContentType("text/html");
		try {
			this.out = response.getWriter();
		} catch (IOException e) {
			System.out.println("Writer wurde nicht erzeugt!");
			e.printStackTrace();
		}
		
		this.beispielModelArrayList = beispielModelArrayList; // ArrayList entschatten
	}
	
	/*
	 * Beispiele fuer AusgabeMethoden
	 * 
	 * Es bietet sich grundsaetzlich an, den Methoden zur Ausgabe durch den View stet das Prefix 'out...' voranzustellen,
	 * da man dann einfacher bei der Programmierung mit der Strg+Leertaste-AutoVervollstaendigung von eclipse arbeiten kann!
	 * (alle moeglichen Ausgaben sind bei den KlassenMethoden ganz einfach unter 'o' wie 'out' zu finden...) ^^
	 */
	
	/**
	 * Gibt ModelAttribute zweizeilig aus.
	 */
	public void outModelAttributListe()
	{
		out.println("<u>Zeilenweise Ausgabe</u></br></br>"); // Ueberschrift
		
		for (int i = 0; i < this.beispielModelArrayList.size(); i++)
		{
			beispielModel = beispielModelArrayList.get(i); // Model aus dem Array holen
			
			out.println("Nummer: " + beispielModel.getModelNummer() + "</br>"); // Nummer ausgeben
			out.println("Name: " + beispielModel.getModelName() + "</br>"); // Namen ausgeben
			out.println("Farbe: " + beispielModel.getModelFarbe() + "</br><br>"); // Farbe ausgeben
			
		}
	}
	
	/**
	 * Gibt drei Leerzeilen aus.
	 */
	public void outDreiLeerzeilen() // ist natuerlich eigentlich Quatsch, diese Funktion - aaaaaber geht auch!! =D
	{
		out.println("</br></br><br>");
	}
	
	
	/**
	 * Gibt ModelAttribute als Tabelle aus.
	 */
	public void outModelAttributeTabelle()
	{
		out.println("<u>Augabe als Tabelle</u></br></br>"); // Ueberschrift
		
		out.println("<table border='1'><tr><th>Nummer</th><th>Name</th><th>Farbe</th></tr>"); // Tabellenkopf
		
		for (int i = 0; i < this.beispielModelArrayList.size(); i++)
		{
			beispielModel = beispielModelArrayList.get(i); // Model aus dem Array holen
			
			out.println("<tr><td>" + beispielModel.getModelNummer() + 
						"</td><td>" + beispielModel.getModelName() +
						"</td><td>" + beispielModel.getModelFarbe() +
						"</td></tr>");			
		}
		
		out.println("</table>"); // Tabelle schliessen
	}
	

}
