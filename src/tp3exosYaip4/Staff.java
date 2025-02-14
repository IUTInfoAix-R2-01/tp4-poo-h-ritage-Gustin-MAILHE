package tp3exosYaip4;

public class Staff extends Person{
	private String school;
	private double pay;
	
	
	// <==== Getter and Setter ====>
	public String getSchool() {
		return school;
	}
	public void setSchool(String school) {
		this.school = school;
	}
	
	public double getPay() {
		return pay;
	}
	public void setPay(double pay) {
		this.pay = pay;
	}
	
	// <==== Constructors ====>
	public Staff(
			String name,
			String address,
			String school,
			double pay) {
		super(name, address);
		this.setSchool(school);
		this.setPay(pay);
	}
	
	@Override
	public String toString() {
		return ("Staff[" + super.toString() +
				",school=" + this.school +
				",pay=" + this.pay + "]");
	}
	
	
	// <==== Test ====>
	public static void main(String[] arg) {
		Person p = new Staff("unNom", "Rue Quelque Part", "Université Aix-Marseille", 2200.0);
		System.out.println(p);
	}
}
