
public class MessageSender {

	public IStorage storage;

	//// CONSTRUCTOR
	public MessageSender(IStorage storage) {
		this.storage = storage;
	}

	public void sendMessageToList(IStorage storage, String sender, String message) {
		for (int i = 0; i < storage.size(); i++) {
			Object p = storage.get(i);
			((Person) p).sendMessage(((Person) p).getEmail(), sender, message);
		}
	}

}
