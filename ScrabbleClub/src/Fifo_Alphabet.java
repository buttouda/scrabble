
public class Fifo_Alphabet {
	Alphabet[] tab_lettre;
	private int curs_In;
	private int curs_Out;
	
	
	//constructeur primitif	
	public Fifo_Alphabet (int taille) {
		tab_lettre= new Alphabet[taille]; // on crée notre tableau de carte
		curs_In=0;
		curs_Out=0;	
	}
		
	
	// observateurs canoniques 
	public Alphabet getObjet_Carte(int index) {return this.tab_lettre[index];}
	public int getValeur_lettre(int index) {return this.tab_lettre[index].getValeur() ; }  
	public String getlettre(int index) {return this.tab_lettre[index].getLettre() ; }
	
	public int getIn() {return this.curs_In; }				// on recupere la valeur de curs_In du tableau de cartes
	public int getOut() {return this.curs_Out; }			// on recupere la valeur de curs_Out du tableau de cartes
	public int getLength() {return this.tab_lettre.length; }	// on recupere la longueur du tableau de cartes
	
	
	// vider la file
	public void clear(){
		for (int i=0;i<this.tab_lettre.length;i++){
			this.tab_lettre[i]= null;
		}
		this.curs_In=0;
		this.curs_Out=0;	
	}
	
	
	//ajouter une carte à la file
	public void push(Alphabet lettre){
		if (lettre != null){
			if(!this.isFull()){   // si la file n'est pas pleine
			
				if(this.curs_In==this.tab_lettre.length-1){
					this.tab_lettre[this.curs_In]=lettre;
					this.curs_In=0;
				}
				else {
					this.tab_lettre[this.curs_In]=lettre;
					this.curs_In+=1;
					}
			}
			else System.out.println("La précondition n'est pas respectée");
		}
		else System.out.println("Impossible de d'ajouter une valeur nulle");
	}

	//retirer une carte à la file
	public void pull(){
		if(!this.isEmpty()){   // si la file n'est pas vide
			
			if(this.curs_Out==this.tab_lettre.length-1){
				this.tab_lettre[this.curs_Out]=null;
				this.curs_Out=0;
			}
			else {
				this.tab_lettre[this.curs_Out]=null;
				this.curs_Out+=1;}
		}
		else System.out.println("La précondition n'est pas respectée");

	}
	
	
	//file est pleine
	public boolean isFull(){
		
		for (int i=0;i<this.tab_lettre.length;i++){
			if (this.tab_lettre[i]== null){
				return false;
			}
		}
		return true;
	}
	
	
	//file est vide
	public boolean isEmpty(){
		
		for (int i=0;i<this.tab_lettre.length;i++){
			if (this.tab_lettre[i]!= null){
				return false;
			}
		}
		return true;
	}

}
