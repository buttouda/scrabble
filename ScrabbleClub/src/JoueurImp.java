import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;


public class JoueurImp extends UnicastRemoteObject implements Joueur{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private ArrayList<Alphabet> main;
	private String nom;
	private int point;
	
	public JoueurImp () throws RemoteException{
		main = new ArrayList<Alphabet>();
		this.nom=nom;
		this.point=0;
	}
	public String getNom() throws RemoteException{
		return this.nom;
	}
	public int getPoint() throws RemoteException {
		return this.point;
	}
	public void setNom(String n) throws RemoteException {
		this.nom=n;
	}
	public void setPoint(int p) throws RemoteException {
		this.point=p;
	}
	
	public void PiocherJeton(Alphabet A) throws RemoteException {
		main.add(A);
	}
	public int Gagnerpoint(Alphabet a) throws RemoteException {
		return this.point+=a.getValeur();
	}
	public void AfficherMain() throws RemoteException {
		for(int i=0;i<main.size();i++){
		System.out.println(main.get(i).getLettre());
		}
	}

}
