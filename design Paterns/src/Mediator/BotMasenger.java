package Mediator;

public class BotMasenger {
	
private static BotMasenger instance;
	
	public BotMasenger() {
		
	}
	
	
	public static BotMasenger getInstance() {
		
		if(instance == null) {
			instance = new BotMasenger();
		}		
		
		return instance;
		
	}
	
	public boolean messageCheck(String message) {
		
		if(message.contains("Cat")) {
			
			System.out.println("This Bot: '" + message + "', Will be deleted.");
			
			return false;
			
		}
		
		return true;
	}
	
}
