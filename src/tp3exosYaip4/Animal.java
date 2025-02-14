package tp3exosYaip4;

public class Animal {
	private String name;
	
	
	// <==== Constructors ====>
	public Animal(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return ("Animal[name=" + this.name + "]");
	}
	
	// <==== Tests ====>
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal unAnimal = new Animal("sonNom");
		System.out.println(unAnimal);
	}

}
