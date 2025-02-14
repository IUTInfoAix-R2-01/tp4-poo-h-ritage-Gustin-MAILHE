package tp3exosYaip6;

public class Circle implements GeometricObject {
	private double radius;
	
	// <== Constructors ==>
	public Circle(double radius) {
		this.radius = radius;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI*radius*radius;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return Math.PI*radius*2;
	}

	@Override
	public String toString() {
		return ("Circle[radius=" + this.radius + "]");
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		Circle unCercle = new Circle(1.0);
		System.out.println(unCercle.getArea());
		System.out.println(unCercle.getPerimeter());
		System.out.println(unCercle);
	}
}
