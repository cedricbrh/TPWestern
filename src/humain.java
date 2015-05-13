
public class humain {
	private String nom;
	private String boissonFav = "Eau";
	
	public humain(String unNom, String unBoissonFav){
	unNom=nom;
	unBoissonFav=boissonFav;
	}
	
	public humain(String unNom){
		nom = unNom;
	}
	
	public String parle(String texte) {
		 return  nom+ ' '+texte;
	}
	public String presenter(){
		return "Bonjour, je suis "+nom+"\nAh un bon verre de "+boissonFav+" ! GLOUPS !";
	}
	
	public String quelEstTonNom(){
		return "";
	}
	
	public String quelEstTaBoisson(){
		return "";
	}
	
}
