package tp3exosYaip6;

public class BigDog extends Dog{
	@Override
	public void greets() {
		System.out.println("Wooow");
	}
	
	@Override
	public void greets(Dog anOther) {
		System.out.println("Woooooow");
	}
	
	public void greets(BigDog anOther) {
		System.out.println("Wooooooooow");
	}
	
	// <==== Constructors ====>
	public BigDog(String name) {
		super(name);
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		BigDog unChien = new BigDog("leNomDuChien");
		Dog unAutreChien = new Dog("leNomDuChien");
		BigDog encoreUnAutreChien = new BigDog("leNomDuChien");
		unChien.greets();
		unChien.greets(unAutreChien);
		unChien.greets(encoreUnAutreChien);
	}
}