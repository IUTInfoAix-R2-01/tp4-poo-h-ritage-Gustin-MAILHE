package tp3exosYaip6;

public class Rectangle implements GeometricObject {
	private double length;
	private double width;
	
	// <== Constructors ==>
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return this.length*this.width;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return (this.length+this.width)*2;
	}

	@Override
	public String toString() {
		return ("Rectangle[width=" + this.width +
				",length=" + this.length + "]");
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		Rectangle unRectangle = new Rectangle(2.0, 5.0);
		System.out.println(unRectangle.getArea());
		System.out.println(unRectangle.getPerimeter());
		System.out.println(unRectangle);
	}
}
