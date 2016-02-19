import java.util.ArrayList;

public class JobAppliationMain {

	public static void main(String[] args) {
		//Instantiating methods of contacting objects via the IContact interface
		IContact email = new Email();  
		IContact sms = new SMS();
		
		//Instantiating Array
		ArrayList<Person> atendees = new ArrayList<>();
		
		//Instantiating a person, passing through preferred contact type.
		GeneralEmployee g1 = new GeneralEmployee("John", "Mac","abc@gmail.com", email);
		g1.setJobTitle("front");
		atendees.add(g1);
		
		Contractor c1 = new Contractor("Ace", "Ventura","ace@mail.com", email);
		c1.setCompany("rocafella");
		c1.setCompanyContact("steph");
		atendees.add(c1);
		
		

		
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
