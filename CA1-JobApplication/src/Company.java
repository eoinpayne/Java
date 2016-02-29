import java.util.ArrayList;
import java.util.Iterator;

public class Company {

	
	public IStorage storage;

	//// CONSTRUCTOR
//	public Company(IStorage storage) {
//		this.storage = storage;
//	}

	// Sending messages to an array list --- //is this wrapping too many classes
	// up with eachother??
	// main calls this, this calls person, person calls class.
	// alternative is to do a loop in the main. OR put this in the person class
	// as a GROUP message

//	public void sendMessageToList(IStorage storage, String sender, String message) {
//		for (int i = 0; i < storage.size(); i++) {
//			Object p = storage.get(i);
//			((Person) p).sendMessage(((Person) p).getEmail(), sender, message);
//		}
//	}

	// // matching the length of a string with a defined string
	// public String replaceString (String stringInput, String desiredOutput){
	// //split up print from the logic
	// String stringToMatchLength = new String(new
	// char[stringInput.length()]).replace("\0", desiredOutput);
	// return stringToMatchLength;
	// }
	//
	// //Some basic string manipulation to print out a "nice event running"
	// message
	// public void runEvent(){
	// String star = "*";
	// System.out.println();
	// System.out.println(replaceString(eventRunningMessage, "*"));
	// System.out.println(eventRunningMessage);
	// System.out.println(replaceString(eventRunningMessage, star));
	// System.out.println();
	// }

}
