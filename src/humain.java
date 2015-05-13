
public class humain {
	private String nom;
	private String boissonFav = "Eau";
	
	public humain(String unNom){
		nom = unNom;
	}
	
	public String parle(String texte) {
		 return  nom + ": "+ texte;
	}
	public String presenter(){
		return "Bonjour, je suis "+nom+"\nAh un bon verre de "+boissonFav+" ! GLOUPS !";
	}
	
	public String quelEstTonNom(){
		return nom;
	}
	
	public String quelEstTaBoisson(){
		return boissonFav;
	}
	
}
