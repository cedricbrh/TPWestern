public class cowboys extends humain{
	private int popularite=0;
	private String adjectif="vaillant";
	
	public cowboys(String unNom,int unPopularite, String unAdjectif){
		super(unNom);
		popularite=unPopularite;
		adjectif=unAdjectif;
	}
	
	public String tirer (brigands tirreur){
		return "Le "+adjectif+""+quelEstTonNom()+"tire sur "+tirreur.quelEstTonNom()+". PAN ! \n Prend ça, rascal";
	}
	
	
	
	
	
	
}
	