package cycles;

import java.util.Random;

public class Velo {
	private static double DEFAUT_BRAQUET = 13.0;
	private double braquet;
	private double diamRoue;
	private Random genAlea;
	
	public static double getDEFAUT_BRAQUET() {
		return DEFAUT_BRAQUET;
	}
	public static void setDEFAUT_BRAQUET(double dEFAUT_BRAQUET) {
		DEFAUT_BRAQUET = dEFAUT_BRAQUET;
	}
	
	public double getDiamRoue() {
		return diamRoue;
	}
	public void setDiamRoue(double diamRoue) {
		this.diamRoue = diamRoue;
	}
	
	public double getBraquet() {
		return braquet;
	}
	public void setBraquet(double braquet) {
		this.braquet = braquet;
	}
	
	public Random getGenAlea() {
		return genAlea;
	}
	public void setGenAlea(Random genAlea) {
		this.genAlea = genAlea;
	}
	
	
	public Velo() {
		this.setBraquet(DEFAUT_BRAQUET);
	}
	public Velo(double braquet) {
		this.setBraquet(braquet);
	}
	public Velo(double braquet, double diamRoue) {
		this.setBraquet(braquet);
		this.setDiamRoue(diamRoue);
	}
	
	public String toString() {
		return ("Velo [braquet=" + this.braquet + ",diamRoue=" + this.diamRoue + "]");
	}
	
	public double getPuissance(double FrequenceCoupsDePedale) {
		return FrequenceCoupsDePedale*this.braquet*this.diamRoue*genAlea.nextDouble();
	}
	
	
	//fonction test
	public static void main(String[] arg) {
		Random nbRd = new Random();
		Velo monVelo = new Velo(15.0, 6.0);
		monVelo.setGenAlea(nbRd);
		System.out.println(monVelo);
		System.out.println(monVelo.getPuissance(10.0));
	}
}
