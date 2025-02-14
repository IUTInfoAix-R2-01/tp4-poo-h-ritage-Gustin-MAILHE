package cycles;

import java.util.Random;

public class VeloElec extends Velo {
	private static double DEFAUT_FACTEUR_PUISSANCE_MOTEUR = 15.0;
	private double facteurPuissanceMoteur;
	

	public static double getDEFAUT_FACTEUR_PUISSANCE_MOTEUR() {
		return DEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	public static void setDEFAUT_FACTEUR_PUISSANCE_MOTEUR(double dEFAUT_FACTEUR_PUISSANCE_MOTEUR) {
		DEFAUT_FACTEUR_PUISSANCE_MOTEUR = dEFAUT_FACTEUR_PUISSANCE_MOTEUR;
	}
	
	public double getFacteurPuissanceMoteur() {
		return facteurPuissanceMoteur;
	}
	public void setFacteurPuissanceMoteur(double facteurPuissanceMoteur) {
		this.facteurPuissanceMoteur = facteurPuissanceMoteur;
	}
	
	public String toString() {
		return ("VeloElec [faceutPuissanceMoteur=" + this.facteurPuissanceMoteur + "]");
	}
	
	@Override
	public double getPuissance(double FrequenceCoupsDePedale) {
		return super.getPuissance(FrequenceCoupsDePedale)*this.facteurPuissanceMoteur;
	}
	
	// <==== Consturceur ====>
	public VeloElec() {
		super();
		
	}
	public VeloElec(double diamRoue, double coupleMoteur) {
		super();
		super.setDiamRoue(diamRoue);
		this.setFacteurPuissanceMoteur(coupleMoteur);
	}
	public VeloElec(double diamRoue, double coupleMoteur, double braquet) {
		super();
		super.setDiamRoue(diamRoue);
		super.setBraquet(braquet);
		this.setFacteurPuissanceMoteur(coupleMoteur);
	}
	
	// <===== Fonction test ====>
	public static void main(String[] arg) {
		Random nbRd = new Random();
		Velo monVelo = new VeloElec(15.0, 6.0);
		monVelo.setGenAlea(nbRd);
		System.out.println(monVelo);
		System.out.println(monVelo.getPuissance(10.0));
	}

}
