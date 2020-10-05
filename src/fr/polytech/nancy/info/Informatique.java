package fr.polytech.nancy.info;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.control.Tab;


@WebServlet("/Informatique")
public class Informatique extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public Informatique() {
        super();}

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    String nom = request.getParameter("nom");  
	    String prenom = request.getParameter("prenom"); 
		request.setAttribute("nom", nom);
		request.setAttribute("prenom", prenom);
		String[] tableau = {"Romain", "Abir", "Aymen", "Florian"};  
		request.setAttribute("t", tableau);
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/Informatique.jsp").forward(request, response);	
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		doGet(request, response);
	}

}
