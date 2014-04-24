package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import view.BeispielView;
import model.BeispielModel;

/**
 * Servlet implementation class BeispielController
 */
@WebServlet("/BeispielController")
public class BeispielController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	/*
	 * Dies hier sind Variablen, die eigentlich aus der Datenbank eingelesen werden.
	 * 
	 * Ich schätze mal, dass die Daten aus der Datenbank dann im Projekt wohl eher als ArrayList ankommen werden,
	 * aber das ist mir erst zu spät eingefallen... Geht ja auch eher nur ums Prinzip. ;-)
	 */
	private Integer[] eigentlichAusDerDatenbankModelNummer = {4, 6, 325};
	private String[] eigentlichAusDerDatenbankModelName = {"Tom", "TomTom", "TomTeromTomTom"};
	private String[] eigentlichAusDerDatenbankModelFarbe = {"grün", "blau", "rot"};
	private int anzahlDerGeholtenDatenbankEintraege = 3;
	
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeispielController()
    {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*
		 * Zunaechst werden die ModelObjekte erzeugt und per Setter mit Daten gefuellt.
		 * Dann werden sie in einer ArrayList gesammelt.
		 */
		ArrayList<BeispielModel> beispielModelArrayList = new ArrayList<BeispielModel>();
		
		for (int i = 0; i < anzahlDerGeholtenDatenbankEintraege; i++)
		{
			BeispielModel beispielModel = new BeispielModel();
			beispielModel.setModelNummer(eigentlichAusDerDatenbankModelNummer[i]);
			beispielModel.setModelName(eigentlichAusDerDatenbankModelName[i]);
			beispielModel.setModelFarbe(eigentlichAusDerDatenbankModelFarbe[i]);
			
			beispielModelArrayList.add(beispielModel); // fertiges Model dem Array hinzufuegen
		}
		
		/*
		 * Nun wird der View erzeugt.
		 * 
		 * Ihm wird das responseObjekt (fuer den PrintWriter)
		 * und die ArrayList mit den Model mitgegeben.
		 */
		BeispielView beispielView = new BeispielView(response, beispielModelArrayList); // View erzeugen
		
		
		/*
		 * Dann laesst man sich die Daten formatiert (wie in den ViewMethoden festgelegt) vom View ausgeben.
		 */
		beispielView.outModelAttributListe(); // Ausgabe als Liste
		
		beispielView.outDreiLeerzeilen(); // Ein paar Leerezeilen... ^^
		
		beispielView.outModelAttributeTabelle(); // Ausgabe als Tabelle
		
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		super.doGet(request, response); // Im Falle einer POST-Uebertragung die doGet()-Methode aufrufen
	}

}
