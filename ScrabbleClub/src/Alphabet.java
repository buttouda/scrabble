
public class Alphabet {
	
	//attributs
	private String lettre;
	private int valeur;
	static String[] tab_alphabet={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
	
	
	//constructeur primitif
	
	public Alphabet() {
		this.lettre=tab_alphabet[(int) ((Math.random() * 25) + 0)];  // on fixe une valeur parmis les 4 existantes
	}
	public Alphabet(String l){
		this.lettre=l;
	}

	
    // observateurs canoniques
    
    public String getLettre() {return this.lettre;}
    public int getValeur() {
    	switch(this.getLettre()){
    	case "A": 
    	case "E":
    	case "I": 
    	case "L":
    	case "N": 
    	case "O":
    	case "R": 
    	case "S":
    	case "T": 
    	case "U":
    		this.valeur=1;
    		break; 
    	case "D":
    	case "G": 
    	case "M":
    		this.valeur=2;
    		break;
    	case "B":
    	case "C": 
    	case "P":
    		this.valeur=3;
    		break; 
    	case "F":
    	case "H": 
    	case "V":
    		this.valeur=4;
    		break; 
    	case "J":
    	case "Q": 
    		this.valeur=8;
    		break; 
    	case "K":
    	case "W": 
    	case "X":
    	case "Y":
    	case "Z":
    		this.valeur=10;
    		
    		return this.valeur;
    	}
    	
    	
    	
    	return this.valeur;}
    
    // observateurs
    public String toString() {
    	return "( "+this.lettre+")";
    }
	
    
    // observateurs relationels
    public boolean equals(Alphabet alpha_param){
    	return this.lettre == alpha_param.lettre;
        }
    
    /*
     * Nous n'avons pas besoin de mutateurs
     */
    
    
    // methode pour savoir si la carte est supérieur à une autre
    public boolean ordre_sup(Alphabet alpha){
    	if (this.getValeur() > alpha.getValeur()){
    		return true;
    	}
		return false; 	
    }
    
    // methode pour savoir si la carte est inférieur à une autre
    public boolean ordre_inf(Alphabet alpha){
    	if (this.getValeur() < alpha.getValeur()){
    		return true;
    	}
		return false; 	
    }
    
    
    // methode finalize
    public void finalize(){
    	System.out.println(this.toString()+"--> La methode Finalize a été appelé");
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//test création objet de type Carte
		Alphabet A = new Alphabet();
		Alphabet B = new Alphabet();
		System.out.println(A.toString());
		System.out.println(A.getValeur());
		System.out.println(B.toString());
		System.out.println(B.getValeur());
		System.out.println(B.ordre_inf(A));
	}
}
