package tp3exosYaip6;

public class Dog extends Animal{
	@Override
	public void greets() {
		System.out.println("Woof");
	}
	
	
	public void greets(Dog anOther) {
		System.out.println("Woooof");
	}
	
	// <==== Constructors ====>
	public Dog(String name) {
		super(name);
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		Dog unChien = new Dog("leNomDuChien");
		Dog unAutreChien = new Dog("leNomDuChien");
		unChien.greets();
		unChien.greets(unAutreChien);
	}
}