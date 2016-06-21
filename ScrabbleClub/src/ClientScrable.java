import java.rmi.*;
import java.rmi.registry.*;
import java.rmi.server.*;
import java.util.Scanner;

public class ClientScrable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create and install the security manager
	      System.setSecurityManager(new RMISecurityManager());

	    try
	    { Joueur joueur = (Joueur)Naming.lookup("rmi://"
	                          + args[0] + "/" + "Joueur");
	    Salon salon = (Salon)Naming.lookup("rmi://"
                + args[0] + "/" + "Salon");
	      // Entrer le nom du joueur
	       String Nomjoueur;
	       
	       System.out.println("Entrer le nom du joueur ");
	       Scanner scanIn = new Scanner(System.in);
	       Nomjoueur = scanIn.nextLine();
	       scanIn.close();  
	       joueur.setNom(Nomjoueur);
	       System.out.println("Bonjouuur"+joueur.getNom());
	      // choisir rejoindre ou creer partie ou visionner partie
	       System.out.println("Veuillez entrer le numero de votre choix: ");
	       System.out.println("1- Créer une partie ");
	       System.out.println("2- Rejoindre une partie ");
	       System.out.println("3- Visionner une partie ");
	      
	       Scanner scanIn1 = new Scanner(System.in);
	       int choix = scanIn1.nextInt();
	       scanIn1.close();
	       
	       switch (choix){
	       case 1: 
	    	   System.out.println("Entrer le nom de la partie ");
		       Scanner scanIn2 = new Scanner(System.in);
		       String Nompartie = scanIn.nextLine();
		       scanIn2.close();
		       salon.setNom(Nompartie);
		       salon.CreerPartie(Nompartie);
	    	   break;
	       case 2 : 
	    	   System.out.println("Liste des parties");
	    	   salon.ListerPartie();
	    	   break;
	       case 3: 
	    	   break;
	       }
	      // affichage selon son choix
	     

	      // si creer partie affichage du salon
	       
	       
	      // traitement de jeu avec affichage de la main et sabot et point 
	    } catch(Exception e)
	    { System.err.println("System Exception" + e);
	    }
	   System.exit(0);
	  }
	

}
