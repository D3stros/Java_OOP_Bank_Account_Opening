
public class Program {

	public static void main(String[] args) {
		// Instances Banks
		DeutscheBank deutscheBank = new DeutscheBank(1000);
		UniCredit uniCredit = new UniCredit(2000);
		KfW kfW = new KfW(3000);
		Commerzbank commerzbank  = new Commerzbank(4000);
		
		// Instances Persons
		Person p1 = new Person("Max", "Mustermann", 2300);
		Person p2 = new Person("Hans", "Miller", 1200);
		Person p3 = new Person("Thomas", "Schulz", 4000);
		
		deutscheBank.openBankaccount(p1);
		kfW.openBankaccount(p2);
		commerzbank.openBankaccount(p3);
	}

}
