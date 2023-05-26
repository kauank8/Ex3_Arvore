package view;

import br.com.kauanPaulino.ArvoreInt.Arvore;

public class main {
	public static void main(String[] args) {
		Arvore arv = new Arvore();
		char vt[]={'M', 'F', 'S', 'D', 'J', 'P', 'U','A', 'E','H', 'Q', 'T', 'W', 'K'};
		for(int i:vt) {
			arv.insert((char) i);
		}
		try {
			arv.remove('F');
			arv.remove('U');
			
			arv.prefixSearch();
			System.out.println("\n========================================");
			arv.infixSearch();
			System.out.println("\n========================================");
			arv.postfixSearch();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
