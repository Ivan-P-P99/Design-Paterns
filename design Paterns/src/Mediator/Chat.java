package Mediator;

import java.util.ArrayList;
import java.util.List;

public class Chat implements MessageMediator {

	private List<User> users;
	private BotMasenger botMasenger;
	
	public Chat() {
		this.users = new ArrayList<>();
	}

	@Override
	public void addUser(User user) {		
		this.users.add(user);		
	}

	@Override
	public void sendMessage(String message, User user) {
		
		if(message.contains("addBot")) {			
			this.botMasenger = BotMasenger.getInstance();
			System.out.println("Bot was added!");			
		}
		
		if(botMasenger != null) {
			this.users.remove(user);	
			
			if(botMasenger.messageCheck(message)){
				
				for(User chatUser : this.users) {		
					if(user != chatUser) {
						chatUser.receive(message);
						
					}
				}	
			}
		}			
	}



	@Override
	public void removeUser(User user) {	
		this.users.remove(user);	
	}

}
