public class Capitale {
	
	// FTW LOL
	
	//Creation des classes privées
	private String nom;
	private int nbHab;
	private int superficie;
	
	//Constructeur par defaut
	public Capitale(){	
		
	}
	
	//Instanciation des paramètres
	public Capitale(String unNom, int unNbHab, int uneSuperficie){
		this.nom=unNom;
		this.nbHab=unNbHab;
		this.superficie=uneSuperficie;
	}

	public String toString() {
		return "Nom de la Capitale : " + getNom() + "\n Nombre d'habitants de la Capitale  : " + getNbHab()
				+ "\n Superficie de la  Capitale : " + getSuperficie() + " km²" + "\n";
	}

	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	/*public Capitale getCapitale(){
		
		
		return Capitale;
	}*/
	
	public int getNbHab() {
		return nbHab;
	}
	public void setNbHab(int nbHab) {
		this.nbHab = nbHab;
	}

	public int getSuperficie() {
		return superficie;
	}
	public void setSuperficie(int superficie) {
		this.superficie = superficie;
	}

	public String nomMaj(){
		String nomMaj = getNom().toUpperCase();
		return nomMaj;
	}
	
	public String nomMin(){
		String nomMin = getNom().toLowerCase();
		//nomMin = nomMin.toUpperCase().charAt(0);
		return nomMin;
	}
	
	public String FirstCaps(){
		  String caps;
		  String cops;
		  String ceps;
		  cops = "";
		  ceps = this.getNom();
		  caps = this.getNom().substring (0,1).toUpperCase();
		  cops = this.getNom().substring (1,ceps.length());
		 
		  
		  return caps + cops;
		  
	 }
	
}