package gun3odev1;

public class Main {

	public static void main(String[] args) {
		
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
		
		Customer customer = new Customer();
		customer.setId(1);
		customer.setCity("Ankara");
		
		Company company = new Company();
		company.setTaxNumber("100000");
		company.setCompanyName("Arçelik");
		company.setId(100);
		
		Person person = new Person();
		person.setNationalIdentity("123456");
		
		Customer c1 = new Customer();
		Customer c2 = new Company();
		Customer c3 = new Person();
		
		

	}

}
