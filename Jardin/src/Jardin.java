import java.util.HashMap;

public class Jardin {
	private int longueur;
	private int largeur;
	private Emplacement emplacement[][];
	private HashMap<String, Integer> panier;

	public Jardin(int longu, int larg) {
		this.panier = new HashMap<String, Integer>();
		this.panier.put("Ail", 4);
		this.panier.put("Carotte", 4);
		this.panier.put("Betterave", 7);
		this.longueur = longu;
		this.largeur = larg;	
		emplacement = new Emplacement[longu][larg];

		for (int x = 0; x < longu; x++) {
			for (int y = 0; y < larg; y++) {
				Emplacement e = emplacement[x][y];
				System.out.println(e);
			}
		}
	}

	public void caseEmplacement() {
		
	}
	
	public void ajouterPanier(String nomVegetal, int qte) {
		this.panier.put(nomVegetal, qte);
	}

}
