
public class humain {
	private String nom;
	private String boisson = "eau";
	
	public humain(String unNom){
		nom = unNom;
	}
	
	public String parle(String texte){
		return nom + texte;
	}
	
	
	public String presenter(){
		return "Bonjour, je suis "+nom+"\nAh un bon verre de "+boisson+" ! GLOUPS !";
	}
	
	public String quelEstTonNom(){
		return "";
	}
	
	public String quelEstTaBoisson(){
		return "";
	}
	
	
}
