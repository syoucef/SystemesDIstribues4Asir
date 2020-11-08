package polytech.nancy.fr;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Jstldemo
 */
@WebServlet("/Jstldemo")
public class Jstldemo extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Jstldemo() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    
		String nom = request.getParameter("nom"); 
		request.setAttribute("nom", nom);
		
		Etudiant e = new Etudiant(1, "Youssef", "samir"); 
		request.setAttribute("etudiant", e);
		int resultat =0; 
		/*
		int a = Integer.parseInt(request.getParameter("a"));
		request.setAttribute("a", a);
		
		int b = Integer.parseInt(request.getParameter("b"));
		request.setAttribute("b", b);
		
		int resultat = a+b; 
		request.setAttribute("resultat", resultat);
		*/
		this.getServletContext().getRequestDispatcher("/WEB-INF/JspJstl.jsp").forward(request, response);
		
	}
	
	
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//String log = request.getParameter("log"); 
		
		Authentification authentification = new Authentification(); 
		authentification.acces(request); 
		
		request.setAttribute("authentification", authentification);
		
		doGet(request, response);
	}

}
