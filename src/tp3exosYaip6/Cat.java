package tp3exosYaip6;

public class Cat extends Animal{
	@Override
	public void greets() {
		System.out.println("Meow");
	}
	
	// <==== Constructors ====>
	public Cat(String name) {
		super(name);
	}
	
	// <==== Tests ====>
	public static void main(String[] arg) {
		Animal unChat = new Cat("leNomDuChat");
		unChat.greets();
	}
}