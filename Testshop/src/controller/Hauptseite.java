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
 * Servlet implementation class Hauptseite
 */
@WebServlet("/Hauptseite")
public class Hauptseite extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Hauptseite() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Einbindung der Kopfzeile
		RequestDispatcher rd; 
		rd = getServletContext().getRequestDispatcher("/Kopfzeile"); 
		rd.include(request, response); 
		
		// Content der Hauptseite
		response.setContentType("text/html"); 
		PrintWriter out = response.getWriter(); 
		out.println("Hauptseite"); 
		
		// Einbindung der Fusszeile
		rd = getServletContext().getRequestDispatcher("/Fusszeile"); 
		rd.include(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
