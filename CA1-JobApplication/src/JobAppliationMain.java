import java.util.ArrayList;

public class JobAppliationMain {

	public static void main(String[] args) {

		// Instantiating methods of contacting objects via the IContact
		// interface
		IContact email = new Email();
		IContact sms = new SMS();

		// Instantiating Array
		IStorage OAL_Atendees = new ObjectArrayList();

		MessageSender messenger = new MessageSender(OAL_Atendees);

		String hr_rob = "robby@hr.com";

		// Instantiating a person, passing through preferred contact type.
		GeneralEmployee ge1 = new GeneralEmployee("John", "Mac", "abc@gmail.com", sms, "10/07/99");
		ge1.setJobTitle("front");
		ge1.setMobileNumber("0851178789");
		OAL_Atendees.addObject(ge1);
		ge1.sendMessage(ge1.getPreferredContactDetails(), hr_rob, "Please Confirm your registration");

		Contractor c1 = new Contractor("Ace", "Ventura", "ace@mail.com", email);
		c1.setCompany("rocafella");
		c1.setCompanyContact("steph");
		c1.setDob("14/01/89");
		c1.setMobileNumber("0862278789");
		OAL_Atendees.addObject(c1);
		c1.sendMessage(c1.getPreferredContactDetails(), hr_rob, "Please Confirm your registration");

		Guest g1 = new Guest("Big", "Kahuna", "big@gmail.com", email);
		g1.setCompany("globotec");
		g1.setCompanyContact("Bob");
		g1.setMobileNumber("0873378789");
		// g1.setContact(sms);
		g1.sendMessage(g1.getPreferredContactDetails(), "melissa@hr.com", "Please Confirm your registration");
		OAL_Atendees.addObject(g1);

		// run event
		// company1.runEvent();
		runEvent();

		// send thank you message to list
		messenger.sendMessageToList(OAL_Atendees, hr_rob, "Thank you for attending the recent event.");

	}

	// HELPER METHODS
	// matching the length of a string with a defined string
	public static String replaceString(String stringInput, String desiredOutput) {																				
		String stringToMatchLength = new String(new char[stringInput.length()]).replace("\0", desiredOutput);
		return stringToMatchLength;
	}

	// Some basic string manipulation to print out a "nice event running" message
	public static void runEvent() {
		String star = "*";
		String eventRunningMessage = "The event is now running";
		System.out.println();
		System.out.println(replaceString(eventRunningMessage, "*"));
		System.out.println(eventRunningMessage);
		System.out.println(replaceString(eventRunningMessage, star));
		System.out.println();
	}
}
