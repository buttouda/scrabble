import java.rmi.*;


public interface Joueur extends Remote {
	
	public String getNom() throws RemoteException;
	public int getPoint() throws RemoteException;
	public void setNom(String n) throws RemoteException;
	public void setPoint(int p) throws RemoteException;
	public void PiocherJeton(Alphabet A) throws RemoteException;
	public int Gagnerpoint(Alphabet a) throws RemoteException;
	public void AfficherMain() throws RemoteException;

}
