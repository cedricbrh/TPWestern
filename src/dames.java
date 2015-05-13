
public class dames extends humain{
	private String couleurRobe;
	private String etat;	
	
	public dames(String unNom, String uneCouleur, String unEtat){
		super(unNom);
		couleurRobe = uneCouleur;
		etat = unEtat;
	}
	
	public String kidnapper(){
		return "AAAAAAAAAAAH, je me fait kidnapper !! ";
	}
	
	public String liberer(cowboys sauveur){
		return "Merci de m'avoir liberée ".sauveur.quelEstTonNom() + " ! ";
	}
	
	public String changeRobe(String nvelleCouleur){
		couleurRobe = nvelleCouleur;
		return "Regardez ma nouvelle robe "+nvelleCouleur + " !";
		
	}
}
