package tp3exosYaip6;

abstract public class Animal {
	private String name;
	
	abstract public void greets();
	
	// <==== Constructor ====>
	public Animal(String name) {
		this.name = name;
	}
}
