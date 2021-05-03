package example2Day4;

public class StarbucksCustomerManager extends BaseCustomerManager  {
	
	private PersonCheckService personCheckService;
	

	public StarbucksCustomerManager(PersonCheckService personCheckService) {
		super();
		this.personCheckService = personCheckService;
	}


	@Override
	public void save(Customer customer) {
		if (personCheckService.checkIfRealPerson(customer)) {
			super.save(customer);	
		}else {
			System.out.println("Not a valid person");
		}
		
			
	}

	
	

}
