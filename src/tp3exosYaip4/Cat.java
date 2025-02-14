package tp3exosYaip4;

public class Cat extends Mammal{
	public void greets() {
		System.out.println("Meow");
	}
	
	
	// <==== Constructors ====>
	public Cat(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return ("Cat[" + super.toString() + "]");
	}
	

	// <==== Tests ====>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat unAnimal = new Cat("sonNom");
		unAnimal.greets();
		System.out.println(unAnimal);
	}
}
