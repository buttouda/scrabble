import java.rmi.RemoteException;


public class Test_joueur {

	/**
	 * @param args
	 * @throws RemoteException 
	 */
	public static void main(String[] args) throws RemoteException {
		// TODO Auto-generated method stub
		SabotImp sabot=new SabotImp();
		sabot.melangerLettre();
		sabot.Afficher();
		Joueur j1 = new JoueurImp();
		Joueur j2 = new JoueurImp();
		System.out.println("---------------Jeu du Joueur1-----------");
		try {
			j1.setNom("Amine");
		} catch (RemoteException e6) {
			// TODO Auto-generated catch block
			e6.printStackTrace();
		}

		try {
			System.out.println(j1.getNom());
		} catch (RemoteException e3) {
			// TODO Auto-generated catch block
			e3.printStackTrace();
		}
		try {
			j1.PiocherJeton(sabot.getObjet_Lettre_Sabot(0));
		} catch (RemoteException e2) {
			// TODO Auto-generated catch block
			e2.printStackTrace();
		}
		sabot.enleverLettre(0);
		try {
			j2.PiocherJeton(sabot.getObjet_Lettre_Sabot(0));
		} catch (RemoteException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		sabot.enleverLettre(0);
		try {
			j1.PiocherJeton(sabot.getObjet_Lettre_Sabot(0));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sabot.enleverLettre(0);
		try {
			j2.PiocherJeton(sabot.getObjet_Lettre_Sabot(0));
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sabot.enleverLettre(0);
		try {
			j1.AfficherMain();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("---------------Jeu du Joueur2-----------");
		try {
			j2.setNom("Quentin");
		} catch (RemoteException e4) {
			// TODO Auto-generated catch block
			e4.printStackTrace();
		}
		try {
			System.out.println(j2.getNom());
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			j2.AfficherMain();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(sabot.getSabot_Length());
		sabot.Afficher();

	}

}
