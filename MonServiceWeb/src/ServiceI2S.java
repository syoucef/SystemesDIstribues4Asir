import java.awt.List;
import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/* annotations de Jax-ws (Java Annotaion XML for Web Service) basées sur
 JAX-B .... 
 */
@WebService(targetNamespace="http://www.polytech.fr")
public class ServiceI2S {
	// Je simule la partie DAO (couche données) ....
	
	public static ArrayList<Product> products = new ArrayList<>(); 
	static {
		products.add(new Product("Ordinateur portable", 650, 680));
		products.add(new Product("Tablette", 650, 680));
		products.add(new Product("Switch", 240, 299));
		products.add(new Product("Routeur", 350, 410));
		products.add(new Product("Ordinateur de bureau", 1200, 1280));
		products.add(new Product("USB", 11, 18));
	}
	
	@WebMethod(operationName="tous")
	public ArrayList<Product> afficherTousLesPrpduits(){
		return products; 
	}
	
	@WebMethod(operationName="ajout")
	public Product ajouter(int code, String designation, double prix_achat, 
			double prix_vente) {
		Product p = new Product(code, designation, prix_achat, prix_vente); 
		products.add(p); 
		return p; 
	}
	/* Ecrire une méthode qui permet de retourner uniquement les produits
	dont le prix d'achat est supérieur à une valeur donnée ....
	*/
	public ArrayList<Product> listeProduitSuperieur(double mt){
		ArrayList<Product> results = new ArrayList<>(); 
		for (Product product : products) {
			if(product.getPrix_achat()>=mt) {
				results.add(product); 
			}
			
		}
		return results; 
	}
	
	/* Ecrire une méthode qui permet de retourner un produit sachant son 
	 identifiant ....
	 */
	public Product getProduct(int code) {
		
		for (Product product : products) {
			if(product.getCode()==code) {
				return product;
			}
		}
		return null;
	}
	
	
	
	
	
	
	
	
	
	
	public String afficher() {
		return "Bonjour !"; 
	}
	
	
	@WebMethod(operationName="sommeI2S")
	public double somme(@WebParam(name="param1")	double a, double b) {
		return 1-1+ a+b; 
	}
	
	
	@WebMethod(operationName="convertir")
	public double conversion(@WebParam(name="montant")double mt) {
		return 1.16*mt; 
	}
	

}
