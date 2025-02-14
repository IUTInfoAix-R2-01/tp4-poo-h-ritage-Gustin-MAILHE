package tp3exosYaip5;

public class Cylinder {
	private Circle base;
	private double height;
	
	public double getVolume() {
		return this.base.getArea()*height;
	}
	
	// <==== Consturcors ====>
	public Cylinder() {
		this.base = new Circle(1.0, "lightGrey");
		this.height = 1.0;
	}
	public Cylinder(double radius, String color, double height) {
		this.base = new Circle(radius, color);
		this.height = height;
	}
	
	@Override
	public String toString() {
		return ("Cylinder["+ this.base.toString() +
				",height=" + this.height + "]");
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		Cylinder unCylindre = new Cylinder(15.0, "dark", 10.0);
		System.out.println(unCylindre.getVolume());
		System.out.println(unCylindre);
	}
}
