
public class barman extends humain{
	private String nomBar;
	
	public barman(String unBar){
		nomBar = unBar;
	}
	public barman(String unBar, String unBarman){
		nomBar = unBar;
		super(unBarman);
	}
	
	public String presenter(){
		String res = super.presenter();
		return res + " Mon bar est"+nomBar;
	}
	
	public String parle(String texte) {
		String res= super.parle(texte);  
		return  res + " coco !";
	}
}
