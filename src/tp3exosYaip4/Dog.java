package tp3exosYaip4;

public class Dog extends Mammal{
	public void greets() {
		System.out.println("Woof");
	}
	public void greets(Dog another) {
		System.out.println("Woooof");
	}
	
	// <==== Constructors ====>
	public Dog(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return ("Dog[" + super.toString() + "]");
	}
	

	// <==== Tests ====>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog unAnimal = new Dog("sonNom");
		Dog unAutreAnimal = new Dog("sonNom");
		unAnimal.greets();
		unAnimal.greets(unAutreAnimal);
		System.out.println(unAnimal);
	}
}
