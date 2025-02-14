package tp3exosYaip5;

public class Circle {
	private double radius;
	private String color;
	
	public double getArea() { 
		return Math.PI*radius*radius;
	}
	
	// <==== Constructors ====>
	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}
	
	@Override
	public String toString() {
		return ("Circle[radius=" + this.radius + 
				",color=" + this.color + "]");
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		Circle unCercle = new Circle(15.0, "lightGrey");
		System.out.println(unCercle.getArea());
		System.out.println(unCercle);
	}
}
