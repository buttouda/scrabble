import java.rmi.*;

public interface Salon extends Remote {
	
	
	public String getNom() throws RemoteException;
	public void setNom(String n)throws RemoteException;
	public void ListerPartie() throws RemoteException;
	public void CreerPartie(String s) throws RemoteException;
	public void Tapis() throws RemoteException;
	public void AfficherMessage() throws RemoteException;
	public void setCellule(Alphabet A) throws RemoteException;
	public void RejoindrePartie() throws RemoteException;

}
