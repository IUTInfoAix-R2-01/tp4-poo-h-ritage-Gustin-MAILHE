package tp3exosYaip4;

public class Person {
	private String name;
	private String adress;
	
	
	

	public String getName() {
		return name;
	}

	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	
	// <==== Consturceur ====>
	Person(String name, String adress){
		this.name = name;
		this.setAdress(adress);
	}

	
	@Override
	public String toString() {
		return ("Person[name=" + this.name + ",adress=" + this.adress + "]");
	}
	
	
	// <==== Test ====>
	public static void main(String[] arg) {
		Person p = new Person("unNom", "Rue Quelque Part");
		System.out.println(p);
	}
}
