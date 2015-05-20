public class dames extends humain{
	private String couleurRobe;
	private String etat;	
	
	public dames(String unNom, String uneCouleur, String unEtat){
		super(unNom, "lait");
		couleurRobe = uneCouleur;
		etat = unEtat;
	}
	
	public String kidnapper(){
		etat = "captive"; 
		return parle("AAAAAAAAAAAH, je me fait kidnapper !!");
	}
	
	public String liberer(cowboys sauveur){
		return parle("Merci de m'avoir liberée "+sauveur.quelEstTonNom() + " ! ");
	}
	
	public String changeRobe(String nvelleCouleur){
		couleurRobe = nvelleCouleur;
		return parle("Regardez ma nouvelle robe "+couleurRobe+ " !");
		
	}
	public String quelEstTonNom(){
		String nom= super.quelEstTonNom();
		return "Miss "+ nom;
	}
	
	public String presenter(){
		String res = super.presenter();
		return res + " Ma robe est "+couleurRobe+" !";
	}
}
