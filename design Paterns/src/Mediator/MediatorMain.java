package Mediator;


public class MediatorMain {

	public static void main(String[] args) {


		MessageMediator chat = new Chat();
		
		User user1 = new ChatUser(chat, "Sasho");
		User user2 = new ChatUser(chat, "Pesho");
		User user3 = new ChatUser(chat, "Gosho");
		
		
		user2.send("Hello ");
		user1.send("Cat ");
		user3.send("addBot ");
		
		
	}

}
