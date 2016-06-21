import java.net.InetAddress;
import java.net.MalformedURLException;
import java.net.UnknownHostException;
import java.rmi.Naming;
import java.rmi.*;
import java.rmi.RemoteException;


public class EnregistrerRegistre {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			/*if (System.getSecurityManager() == null) {
			System.setSecurityManager(new RMISecurityManager());
			}*/
			SalonImp salon = new SalonImp();
			String url = "rmi://" + InetAddress.getLocalHost().getHostAddress() + "/TestRMI";
			System.out.println("Enregistrement de l'objet avec l'url : " + url);
			Naming.rebind(url, salon);
			System.out.println("Serveur lancé");
			} catch (RemoteException e) {
			e.printStackTrace();
			} catch (MalformedURLException e) {
			e.printStackTrace();
			} catch (UnknownHostException e) {
			e.printStackTrace();
			}

	}

}
