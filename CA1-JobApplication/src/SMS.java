

public class SMS implements IContact{
	public String toString(){
		return "SMS";
	}
	
	//can i pass person object through this, so as whenever SMS is the iContact used, it will know 
	//to print "sending text to" ... and then type this.getPhoneNumber, then do something similar in email.
	
	public void sendMessage(String msg_to, String msg_from, String message) {
		
		//Maybe take logic from Person.sendmessage and
		//System.out.println("##Sending Text ");

	}
		
	
}
