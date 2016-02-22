import java.util.ArrayList;

public class Person implements IContact{
	
	private String firstName; //all
	private String lastName; //all
	private String dob; //in GE & contractor NOT guest
	private String email;	// all
	private String mobileNumber;
	private String preferredContactMethod;   //set a default that can be overridden??
	private String preferredContactDetails;
	private IContact contact = null;
		
	//getters & setters
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getMobileNumber() {
		return mobileNumber;
	}
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	public IContact getContact() {
		return contact;
	}
	public void setContact(IContact contact) {
		this.contact = contact;
		}
	public String getPreferredContactMethod() {
		return preferredContactMethod;
	}
	public void setPreferredContactMethod(String preferredContactMethod) {
		this.preferredContactMethod = preferredContactMethod;
	}
	//getter that determines what contact details should be returned based on what interface is being used
	public String getPreferredContactDetails() {
		String sms = "sms";
		//String email = "email";
	if (getContact().toString().toLowerCase().indexOf(sms)> -1){ //.getContact returning undesirable string
		return this.mobileNumber;	
		}
	else {	return this.email;	}  //if not phone, default will be email
	}
		
	/////////////constructor
	public Person (String firstName, String lastName, String email, IContact contact){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;		
		this.contact = contact;
	}
	
	//works well, but makes the SMS/EMail class redundant
	public void sendMessage(String msg_to, String msg_from, String message){
		//contact.sendMessage(msg_to, msg_from, message);   #### IS THIS NEEDED?		
		System.out.println("Sending " + this.getContact() + " to " + this.getPreferredContactDetails() );
		System.out.println(this.firstName +". "+ message);
	}
	
//	public void sendMessage(String msg_to, String msg_from, String message){
//		contact.sendMessage(msg_to, msg_from, message);   //#### IS THIS NEEDED?		
//
//	}
	
}

