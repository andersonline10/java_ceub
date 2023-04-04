package apresentacao;

import negocio.Caipirinha;
import negocio.Drink;
import negocio.DryMartini;
import negocio.Mixer;
import negocio.MoscowMule;
import negocio.OldFashion;

public class PrincipalBar {

	public static void main(String[] args) {
		Drink objDrink = null;
		
		objDrink = new Caipirinha();
		((Mixer) objDrink).misturar();
		objDrink.beber();
		System.out.println();
		objDrink = new DryMartini();
		((Mixer) objDrink).misturar();
		objDrink.beber();
		System.out.println();
		objDrink = new OldFashion();
		((Mixer) objDrink).misturar();
		objDrink.beber();
		System.out.println();
		objDrink = new MoscowMule();
		((Mixer) objDrink).misturar();
		objDrink.beber();
		
		

	}

}
