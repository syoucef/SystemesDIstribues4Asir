package polytech.nancy.fr;

import java.io.Serializable;

import javax.servlet.http.HttpServletRequest;
public class Authentification implements Serializable{
private boolean connexion;



// ici, on simule un mot de passe = login+4321 (ce n'est certainement pas comme ça qu'il
//faut procéder dans une application mise en production .... on vera ça quand je vais vous
//introduire la couche DAO ....)
public void acces(HttpServletRequest request) {
	String login = request.getParameter("log");
	String pass = request.getParameter("pass"); 
	if(pass.equals(login+"4321")) {
		this.connexion=true;
	}
	else {
		this.connexion=false; 
	}
	
}

public Authentification() {
	super();
}

public boolean isConnexion() {
	return connexion;
}

public void setConnexion(boolean connexion) {
	this.connexion = connexion;
}

@Override
public String toString() {
	return "Authentification [connexion=" + connexion + "]";
} 





}
