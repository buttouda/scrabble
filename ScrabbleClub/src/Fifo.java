
public class Fifo {
	private int[] tab_int;
	private int curs_In;
	private int curs_Out;
	
	
	//constructeur primitif	
	public Fifo (int taille) {
		tab_int= new int[taille]; // on crée notre tableau de int
		curs_In=0;
		curs_Out=0;	
	}
		
	
	// observateurs canoniques 
	public int getValeur(int index) {return this.tab_int[index] ; }
	public int getIn() {return this.curs_In; }
	public int getOut() {return this.curs_Out; }
	public int getLength() {return this.tab_int.length; }
	
	
	// vider la file
	public void clear(){
		for (int i=0;i<this.tab_int.length;i++){
			this.tab_int[i]= 0;
		}
		this.curs_In=0;
		this.curs_Out=0;	
	}
	
	
	//ajouter un entier à la file
	public void push(int valeur){
		if (valeur != 0){
			if(!this.isFull()){   // si la file n'est pas pleine
			
				if(this.curs_In==this.tab_int.length-1){
					this.tab_int[this.curs_In]=valeur;
					this.curs_In=0;
				}
				else {
					this.tab_int[this.curs_In]=valeur;
					this.curs_In+=1;
					}
			}
			else System.out.println("La précondition n'est pas respectée");
		}
		else System.out.println("Impossible de d'ajouter une valeur nulle");
	}

	//retirer un entier à la file
	public void pull(){
		if(!this.isEmpty()){   // si la file n'est pas vide
			
			if(this.curs_Out==this.tab_int.length-1){
				this.tab_int[this.curs_Out]=0;
				this.curs_Out=0;
			}
			else {
				this.tab_int[this.curs_Out]=0;
				this.curs_Out+=1;}
		}
		else System.out.println("La précondition n'est pas respectée");

	}
	
	
	//file est pleine
	public boolean isFull(){
		
		for (int i=0;i<this.tab_int.length;i++){
			if (this.tab_int[i]== 0){
				return false;
			}
		}
		return true;
	}
	
	
	//file est vide
	public boolean isEmpty(){
		
		for (int i=0;i<this.tab_int.length;i++){
			if (this.tab_int[i]!= 0){
				return false;
			}
		}
		return true;
	}

}
