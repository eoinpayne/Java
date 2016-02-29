
public class Email implements IContact{

	public String toString(){
		return "E-Mail";
	}
	
	@Override //necessary??
	public void sendMessage(String msg_to, String msg_from, String message) {
		
	}

}
