import javax.xml.ws.Endpoint;

public class Deploiement {
	
	public static void main(String[] args) {
		String url = "http://localhost:9595/"; 
		Endpoint.publish(url, new ServiceI2S()); 
		
		System.out.println("http://localhost:9595/?wsdl");
		
	}

}
