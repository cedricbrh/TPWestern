
public class Histoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		humain Humain1 = new humain("Henri");
		//System.out.println(Humain1.presenter());
		
		dames dames1 = new dames("Juliette", "Verte", "Libre");
		dames dames2 = new dames("Sophie", "rouge", "Libre");
		//System.out.println(dames1.presenter());
		System.out.println(dames2.presenter());
		
		brigands brigand1 = new brigands("Jack","méchant",2, 100, false);
		brigands brigand2 = new brigands("Luc","méchant",0, 300, false);
		System.out.println(brigand1.presenter());
		//System.out.println(brigand2.presenter());
		
		cowboys cowboys1 = new cowboys("Seb",2,"Courageux");
		cowboys cowboys2 = new cowboys("HULK",0,"Vaillant");
		System.out.println(cowboys1.presenter());
		//System.out.println(cowboys2.presenter());
		
		System.out.println(dames1.changeRobe("Bleu"));
		
		
		System.out.println(dames1.kidnapper());
		System.out.println(brigand2.kidnappe(dames1));
		System.out.println(cowboys1.tirer(brigand2));
		System.out.println(brigand2.emprisonner(cowboys1));
		System.out.println(cowboys1.liberer(dames1));
		System.out.println(dames1.liberer(cowboys1));
	}

}
