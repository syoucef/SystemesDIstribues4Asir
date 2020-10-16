import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product implements Serializable {
	private int code; 
	private String designation; 
	private double prix_achat; 
	private double prix_vente;
	private static int num =1;  
			
	
	
	public Product(String designation, double prix_achat, double prix_vente) {
		super();
		this.code=num; 
		num++; 
		this.designation = designation;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
	}


	public Product() {
		super();
	}
	
	
	public Product(int code, String designation, double prix_achat, double prix_vente) {
		super();
		this.code = code;
		this.designation = designation;
		this.prix_achat = prix_achat;
		this.prix_vente = prix_vente;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix_achat() {
		return prix_achat;
	}
	public void setPrix_achat(double prix_achat) {
		this.prix_achat = prix_achat;
	}
	public double getPrix_vente() {
		return prix_vente;
	}
	public void setPrix_vente(double prix_vente) {
		this.prix_vente = prix_vente;
	}
	@Override
	public String toString() {
		return "Product [code=" + code + ", designation=" + designation + ", prix_achat=" + prix_achat + ", prix_vente="
				+ prix_vente + "]";
	} 
	
	
	
	
	

}
