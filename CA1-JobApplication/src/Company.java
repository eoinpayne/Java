import java.util.ArrayList;

public class Company {
	private String companyName;
	private String companyEmail;
	private String confirmationMessage;
	private String thankYouMessage;
	private String eventRunningMessage = "The event is now taking place"; //can set getters and setters later
	public IStorage storage = null; ////////////////////////
	
		
	public String getCompanyName() {
		return "McCarthy Websites Limited";
	}
	private void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyEmail() {
		return "McCarthyWebsitesLimited@gmail.com";
	}
	private void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}
	public String getConfirmationMessage() {
		return "Please confirm your attendance";
	}
	public void setConfirmationMessage(String confirmationMessage) {
		this.confirmationMessage = confirmationMessage;
	}
	public String getThankYouMessage() {
		return "Thank you for attending the event";
	}
	public void setThankYouMessage(String thankYouMessage) {
		this.thankYouMessage = thankYouMessage;
	}
	
	/////////CONSTRUCTOR
//	public Company (IStorage storage){
////		this.companyName = companyName;
////		this.companyEmail = companyEmail;
//		this.storage = storage;
//	}
	
	//Sending messages to an array list --- //is this wrapping too many classes up with eachother??
			//main calls this, this calls person, person calls class. 
				// alternative is to do a loop in the main. OR put this in the person class as a GROUP message
	public void sendMessageToList(Iterable storage, Object company, String message){
		
		for (Object p: storage){			
			((Person) p).sendMessage(((Person) p).getEmail(), ((Company) company).getCompanyEmail(), message);
	}
}	
	// matching the length of a string with a defined string
	public String replaceString (String stringInput, String desiredOutput){ //split up print from the logic
		String stringToMatchLength = new String(new char[stringInput.length()]).replace("\0", desiredOutput);
		return stringToMatchLength;
	}

	public void runEvent(){		
		String star = "*";
		
		System.out.println();
		System.out.println(replaceString(eventRunningMessage, "*"));
		System.out.println(eventRunningMessage);
		System.out.println(replaceString(eventRunningMessage, star));
		System.out.println();		
	}
	
}
