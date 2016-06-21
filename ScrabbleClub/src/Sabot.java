import java.rmi.*;

public interface Sabot extends Remote {
	public void melangerLettre() throws RemoteException;
	public void enleverLettre(int index) throws RemoteException;
	public void viderSabot() throws RemoteException;
	public Alphabet getObjet_Lettre_Sabot(int index) throws RemoteException;
	public int getValeur_Lettre_Sabot(int index) throws RemoteException;
	public int getSabot_Length() throws RemoteException;
	public void Afficher() throws RemoteException;

}
