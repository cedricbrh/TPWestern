public class brigands extends humain{
	private String look = "méchant";
	private int nbDamesEnlever;
	private int recompense = 100;
	private boolean prison = false;

	public brigands(String unNom, String unLook, int unNbDames, int uneRecompense, boolean enPrison){
		super(unNom, "Tord-boyaux");
		look= unLook;
		nbDamesEnlever = unNbDames;
		recompense = uneRecompense;
		prison = enPrison;
	}
	
	public String kidnappe(dames dames){
		nbDamesEnlever = nbDamesEnlever +1; 
		return parle("Ah ah ! "+dames.quelEstTonNom()+", tu es mienne désormais");
	}
	
	public String emprisonner(cowboys cowboys){
		prison = true;
		return parle("Damned, je suis fait ! "+cowboys.quelEstTonNom()+", tu m'as eu !" );
	}
	
	public int recompense(brigands brigands){
		return recompense;
	}
	
	public String quelEstTonNom(){
		String nom= super.quelEstTonNom();
		return nom + " le "+ look;
	}
	
	public String presenter(){
		String res = super.presenter();
		return res + " J'ai l'air " +look+" et j'ai kidnappe "+nbDamesEnlever+" dames ! Ma tete est mise a prix "+recompense+" $ !";
	}
}
