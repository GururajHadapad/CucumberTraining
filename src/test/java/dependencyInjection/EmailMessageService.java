package dependencyInjection;

public class EmailMessageService implements MessageService{

	public void sendMessage(String message, String recipient) {
		System.out.println("Email Message recived from user :"+recipient+"\n"+"message "+message);		
	}

}
