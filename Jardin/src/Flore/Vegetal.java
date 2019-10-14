package Flore;


public abstract class Vegetal {
	
	protected Etat etat;
	protected String dessin[];
	
	public Vegetal() {
		
		this.etat = Etat.Graine;
		
		dessin = new String[6];
		dessin[0] = "_";
		dessin[1] = ".";
		dessin[2] = "|";
		dessin[5] = "#";
		
	}	

}