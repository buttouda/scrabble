
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Scanner;
import java.rmi.*;

public class SalonImp extends UnicastRemoteObject implements Salon {
	
	private static final long serialVersionUID = 2674880711467464646L;
	
	Alphabet [][] tapis;
	String Nom;
	ArrayList<String> Partie; 
	
	public SalonImp() throws RemoteException {
		
		tapis = new Alphabet [15][15];
		this.Nom = Nom;
		Partie = new ArrayList<String>();
	}
	public String getNom() throws RemoteException {
		return this.Nom;
	}
	public void setNom(String n)throws RemoteException {
		this.Nom=n;
	}
	public void ListerPartie() throws RemoteException {
		for (int i=0;i<Partie.size();i++){
			System.out.println(Partie.get(i));
		}
	}
	public void CreerPartie(String s) throws RemoteException {
		Partie.add(s);
	}
	public void Tapis() throws RemoteException {
		
		for (int i=0;i<15;i++){
			for (int j=0;j<15;j++){
				tapis[i][j]=null;
				System.out.println(" "+"_"+"_"+"_"+"_"+" ");
				System.out.println("|"+ tapis[i][j]+ "|");
				System.out.println(" "+"_"+"_"+"_"+"_"+" ");
			}
		}
	}
	public void AfficherMessage() throws RemoteException {
		System.out.print("\t");System.out.print("\t");
		System.out.print("\t");System.out.println("+++++++++++++++++++++++++++++++++++++++++++ ");
		System.out.print("\t");System.out.print("\t");System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
		System.out.print("\t");System.out.println("++++++++++++++++++++++++Bienvenu Dans le JEU D SCRABBLE++++++++++++++++++++++ ");
		System.out.print("\t");System.out.print("\t");System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++ ");
		System.out.print("\t");System.out.print("\t");System.out.print("\t");System.out.println("+++++++++++++++++++++++++++++++++++++++++++++ ");
		
	}
	public void setCellule(Alphabet A) throws RemoteException {

	       int X;
	       int Y;
	       System.out.println("Entrer le numero de ligne X ");
	       Scanner scanIn = new Scanner(System.in);
	       X = scanIn.nextInt();
	       scanIn.close();  
	       System.out.println("Entrer le numero de colonne Y ");
	       Scanner scan = new Scanner(System.in);
	       Y = scan.nextInt();
	       scan.close();   
	       
		tapis[X][Y]=A;
	}
	public void RejoindrePartie() throws RemoteException {
		
	}
}


