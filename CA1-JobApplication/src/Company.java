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
//	//awkard!!!!! 
//	public void sendMessageToList(ArrayList<Object> list, Object Company, String message){
//		for (Object p: list){			
//			p.sendMessage(((Object) p).getEmail(), ((Company) Company).getCompanyEmail(), ((Company) Company).getThankYouMessage());
//		
//		
//	System.out.println(this.thankYouMessage);
//	}
//}
	
//	public void sendConfirmationMessage(){
//		
//	}
//	
	public void runEvent(){
		System.out.println();
		System.out.println("The event is now taking place");
		System.out.println();
	}
	
//	public void sendThankYouMessage(){
//		System.out.println(this.thankYouMessage);
//	}
}
