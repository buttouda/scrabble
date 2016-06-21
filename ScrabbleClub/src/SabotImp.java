import java.rmi.*;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Collections;


public class SabotImp extends UnicastRemoteObject implements Sabot {
	private ArrayList<Alphabet> sabot;
	
	
	
	
	public SabotImp() throws RemoteException {
	    // Initialise 
	    sabot = new ArrayList<Alphabet>();
			for(int i=0;i<15;i++){
																			// cas d'un E
						sabot.add(new Alphabet("E"));
					}
			for(int j=0;j<9;j++){				// cas d'un A
						sabot.add(new Alphabet("A"));
					}
			for(int k=0;k<8;k++){
				// cas d'un I et N
sabot.add(new Alphabet("I"));
}
for(int l=0;l<6;l++){				// cas d'un U/N/O/R/S/T
sabot.add(new Alphabet("O"));
sabot.add(new Alphabet("R"));
sabot.add(new Alphabet("S"));
sabot.add(new Alphabet("T"));
sabot.add(new Alphabet("N"));
sabot.add(new Alphabet("U"));
}
for(int m=0;m<5;m++){
	// cas d'un L
sabot.add(new Alphabet("L"));
}
for(int n=0;n<3;n++){
	// cas d'un H/L/K/W
sabot.add(new Alphabet("D"));
sabot.add(new Alphabet("M"));

}
for(int n=0;n<2;n++){
	// cas d'un M/U/Y/P/V
sabot.add(new Alphabet("G"));

sabot.add(new Alphabet("B"));
sabot.add(new Alphabet("C"));
sabot.add(new Alphabet("P"));

sabot.add(new Alphabet("F"));
sabot.add(new Alphabet("H"));
sabot.add(new Alphabet("V"));
}
sabot.add(new Alphabet("J"));

sabot.add(new Alphabet("Q"));
sabot.add(new Alphabet("K"));
sabot.add(new Alphabet("W"));

sabot.add(new Alphabet("X"));
sabot.add(new Alphabet("Y"));
sabot.add(new Alphabet("Z"));
					
		}
	
	
	
	public void melangerLettre() throws RemoteException {
	    Collections.shuffle(sabot);
	}
	
	//methode pour enlever une carte
	public void enleverLettre(int index) throws RemoteException {
	    this.sabot.remove(index);
	}
	
	//methode pour vider le sabot
	public void viderSabot() throws RemoteException {
	    this.sabot.clear();
	}
	
	// observateurs canoniques 
	public Alphabet getObjet_Lettre_Sabot(int index) throws RemoteException {return this.sabot.get(index);}
	public int getValeur_Lettre_Sabot(int index) throws RemoteException {return this.sabot.get(index).getValeur(); }    	// on recupere la valeur de la carte à l'index i	
	public int getSabot_Length() throws RemoteException {return this.sabot.size();} // renvoie la taille du tableau
	public void Afficher() throws RemoteException {
		for(int i=0;i<sabot.size();i++){
	    System.out.println(sabot.get(i).getLettre());
		}
	}

}
