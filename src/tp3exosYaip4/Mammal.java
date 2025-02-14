package tp3exosYaip4;

public class Mammal extends Animal{
	Mammal(String name){
		super(name);
	}
	
	@Override
	public String toString() {
		return ("Mammal[" + super.toString() + "]");
	}
	
	
	// <==== Tests ====>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal unAnimal = new Mammal("sonNom");
		System.out.println(unAnimal);
	}
}
