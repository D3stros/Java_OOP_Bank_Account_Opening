
public class Bank {
	
	private String nameOfBank;
	private double limit;
	
	public Bank(double limit) {
		this.limit = limit;
	}

	public String getNameOfBank() {
		return nameOfBank;
	}

	public void setNameOfBank(String name) {
		this.nameOfBank = name;
	}

	public double getLimit() {
		return limit;
	}

	public void setLimit(double limit) {
		this.limit = limit;
	}
	
	public void openBankaccount(Person p) {
		System.out.println();
		System.out.println("Hello Mr. " + p.getLastName());
		System.out.println("You succesfully opened a bank account:");
		System.out.println();
		
		p.setMyBank(this);
		
		System.out.println("Name of the bank: " + this.getNameOfBank());
		
		System.out.println("Your balance:" + p.getMoney());
		System.out.println("Credit limit: " + this.getLimit());
		System.out.println("***************************");
		
	}
	

}
