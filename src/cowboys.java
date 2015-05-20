public class cowboys extends humain{
	private int popularite=0;
	private String adjectif="vaillant";
	//private String boisson = super.quelEstTaBoisson();
	
	public cowboys(String unNom,int unPopularite, String unAdjectif){
		super(unNom,"whisky");
		popularite=unPopularite;
		adjectif=unAdjectif;
		//String boisson = super.quelEstTaBoisson();
		//boisson ="Whisky";
	}
	
	public String tirer (brigands tirreur){
		return parle("Le "+adjectif+" "+quelEstTonNom()+" tire sur "+tirreur.quelEstTonNom()+". PAN ! Prend ça, rascal");
	}
	
	public String liberer(dames dames){
		popularite = popularite +1;
		return parle("Que vous etes jolie " +dames.quelEstTonNom() + " !");
	}
	
	public String presenter(){
		String res = super.presenter();
		return res + " On dit que je suis "+adjectif+" et ma popularite est de" +popularite+" !";
	}
	
	
	
}
	