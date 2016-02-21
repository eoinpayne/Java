import java.util.ArrayList;

public class JobAppliationMain {

	public static void main(String[] args) {
		Company company1 = new Company();
		
		
		
		//Instantiating methods of contacting objects via the IContact interface
		IContact email = new Email();  
		IContact sms = new SMS();
		
		//Instantiating Array
		ArrayList<Person> atendees = new ArrayList<>();
		
				//start a while loop.
			//Scanner scanner = new Scanner(new InputSteamReader(System.in))); --sout-- int age = scanner.nextInt(); --scanner.close();
			//, ask for name, etc.. put in variable, use variable to pass through constructor
			//use this string variable when comparing 
					// start while loop and run "build person method" which will ask all field and return for population
		//Instantiating a person, passing through preferred contact type.
		GeneralEmployee ge1 = new GeneralEmployee("John", "Mac","abc@gmail.com", sms, "10/07/99");
		ge1.setJobTitle("front");
		ge1.setMobileNumber("0851178789");
		atendees.add(ge1);
		//ge1.sendMessage(ge1.getPreferredContactDetails(), company1.getCompanyEmail(), company1.getConfirmationMessage());
		
		Contractor c1 = new Contractor("Ace", "Ventura","ace@mail.com", email);
		c1.setCompany("rocafella");
		c1.setCompanyContact("steph");
		c1.setDob("14/01/89");
		c1.setMobileNumber("0862278789");
		atendees.add(c1);
				
		Guest g1 = new Guest("Big", "Kahuna", "big@gmail.com", email);
		g1.setCompany("globotec");
		g1.setCompanyContact("Bob");
		g1.setMobileNumber("0873378789");
		atendees.add(g1);
		
		//!! when sending message, find a way to take the input and use that to either get email for phone
		//"preferred contact information" -- do it through "preferred input" variable defined in loop that 
		// will feed object constructor
							
		///confirmation message
		for (Person p: atendees){
			System.out.println(p.getContact()); //prints SMS@2a139a55
			System.out.println("PREFFERED!!! " + p.getPreferredContactDetails());
			//System.out.println(p.getEmail()+ company1.getCompanyEmail()+ company1.getConfirmationMessage());
			//p.sendMessage(p.getEmail(), company1.getCompanyEmail(), company1.getConfirmationMessage());
		}		
		
//		company1.sendMessageToList(atendees, company1, company1.getConfirmationMessage()){
//			
//		}
		
		//run event
		System.out.println();
		company1.runEvent();
		System.out.println();
		
		//thank you message
		for (Person p: atendees){			
			p.sendMessage(p.getEmail(), company1.getCompanyEmail(), company1.getThankYouMessage());
		}
		
		
		
		// to search through and find which "person" objects are of a certain type.
//		int count =0;
//		for(Person p: atendees) {
//			if(p instanceof GeneralEmployee) {
//				System.out.println("General Employee Found at index: " + count);
//			}
//			if(p instanceof Contractor) {
//				
//			}
//			
//			count++;
//		}

		
		//Person person = atendees.get(0);  //trick to check if atendees(0) is a person.
		//GeneralEmployee ge = (GeneralEmployee) atendees.get(0); //CASTING anteends(0) back to GeneralEmployee
		//ge.getJobTitle();
		
		
//		g1.setFirstName("John");
//		g1.setLastName("Mac");
//		g1.setEmail("abc@gmail.com");


	}

}
