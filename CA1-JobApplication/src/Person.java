
public class Person implements IContact{
	
	private String firstName; //all
	private String lastName; //all
	//private String dob; //in GE & contractor NOT guest
	private String email;	// all
	private String mobileNumber;
	
		
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
	//public String getDob() {
		//return dob;
	//}
	//public void setDob(String dob) {
		//this.dob = dob;
	//}
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


		
	private IContact contact = null;
	
	//constructor
	public Person (String firstName, String lastName, String email, IContact contact){
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;		
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

