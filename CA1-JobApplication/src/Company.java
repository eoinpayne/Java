import java.util.ArrayList;

public class Company {
	private String companyName;
	private String companyEmail;
	private String confirmationMessage;
	private String thankYouMessage;
	
	
	
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
	
//	
//	public void sendConfirmationMessage(ArrayList <Object> atendees){
//		
//	}
	
	
	//awkard!!!!! 
	public void sendMessageToList(ArrayList<Person> list, Object company, String message){
		for (Object p: list){			
			((Person) p).sendMessage(((Person) p).getEmail(), ((Company) company).getCompanyEmail(), 
					message);
		
		
	//System.out.println(this.thankYouMessage);
	}
}
	
	public String replaceString (String stringInput, String desiredOutput){ //split up print from the logic
		String stringToMatchLength = new String(new char[stringInput.length()]).replace("\0", desiredOutput);
		return stringToMatchLength;
	}

	public void runEvent(){
		String eventRunningMessage = "The event is now taking place";
		String starsToMatchLength = new String(new char[eventRunningMessage.length()]).replace("\0", "*");
		String star = "*";
		
		System.out.println();
		//System.out.println(starsToMatchLength);
		System.out.println(replaceString(eventRunningMessage, "*"));
		System.out.println(eventRunningMessage);
		System.out.println(replaceString(eventRunningMessage, star));
		//System.out.println(starsToMatchLength);	
		System.out.println();		
	}
	
//	public void sendThankYouMessage(){
//		System.out.println(this.thankYouMessage);
//	}
}
