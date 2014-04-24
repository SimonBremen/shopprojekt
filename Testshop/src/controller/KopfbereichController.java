package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Kopfzeile
 */
@WebServlet("/Kopfzeile")
public class KopfbereichController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KopfbereichController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Content der Kopfzeile
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		// Tabellengenerierung
		out.println("<table>\n<tr>\n<td>");
		// Content Kopfzeile
		out.println("Kopfzeile");
		// Tabellengenerierung
		out.println("</td>\n</tr>\n<tr>\n<td>");
				
		// Einbindung der Navigation
		RequestDispatcher rd; 
		rd = getServletContext().getRequestDispatcher("/Navigation"); 
		rd.include(request, response); 
		
		// Content der Kopfzeile
		out.println("</td>\n<td>");
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
