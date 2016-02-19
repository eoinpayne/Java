
public class Person {
	
	private String firstName = ""; //all
	private String lastName = ""; //all
	private String dob = ""; //in GE & contractor NOT guest
	private String email = "";	// all
	private String mobileNumber= "";
	private String name = "";
	
	
	private IContact contact = null;
	
	//constructor
	public Person (IContact contact){
		this.contact = contact;
	}
	
	public void sendMessage(String msg_to, String msg_from, String message){
		contact.sendMessage(msg_to, msg_from, message);
	}
	
	
	
}


//salary just GE
//job title GE


//company just Contractor

//Contct guest and contractor

