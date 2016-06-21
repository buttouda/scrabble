import java.net.InetAddress;
import java.rmi.*;


public class LancerServer {

	/**
	 * @param args
	 */
	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		
		// Create and install the security manager
	     System.setSecurityManager(new RMISecurityManager());
		
		
		try {
		
			System.out.println("Mise en place du Security Manager ...");

			SalonImp salon= new SalonImp();
			String url;
				url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/SalonImp";
				System.out.println("Enregistrement de l'objet avec l'url : " + url);
				Naming.rebind(url, salon);
				
				JoueurImp joueur= new JoueurImp();
				String url1;
					url1 = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/JoueurImp";
					System.out.println("Enregistrement de l'objet avec l'url : " + url1);
					Naming.rebind(url1, joueur);
					
					SabotImp sabot= new SabotImp();
					String url2;
						url2 = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/SabotImp";
						System.out.println("Enregistrement de l'objet avec l'url : " + url2);
						Naming.rebind(url2, sabot);
				System.out.println("Serveur lancé");

		
		}
		catch(Exception e){e.printStackTrace();}

	
		}
}
