
public class Histoire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		humain Humain1 = new humain("Henri");
		System.out.println(Humain1.presenter());
		
		dames dames1 = new dames("Juliette", "Verte", "Libre");
		System.out.println(dames1.kidnapper());
		System.out.println(dames1.changeRobe("Bleu"));
		
		
	}

}
