package example2Day4;

import java.time.LocalDate;


public class Main {

	public static void main(String[] args) {
		
		
		Customer customer =new Customer();
		customer.setId(1);
		customer.setFirstName("Sezgin");
		customer.setLastName("ERERNAN");
		customer.setNationalityId("23224486528");
		customer.setDateOfBirth(LocalDate.of(1996,10,14));
		
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(customer);

	}

}
