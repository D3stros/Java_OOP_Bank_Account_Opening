public class Person {
	
	private String firstName;
	private String lastName;
	private double money;
	private Bank myBank;
	
	
	public Person(String firstName, String lastName, double money) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.money = money;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public double getMoney() {
		return money;
	}


	public void setMoney(double money) {
		this.money = money;
	}


	public Bank getMyBank() {
		return myBank;
	}


	public void setMyBank(Bank myBank) {
		this.myBank = myBank;
	}

}
