package dependencyInjection;

import com.google.inject.Inject;

public class MyApplication {
private MessageService messageservice;
@Inject
public MyApplication(MessageService messageservice) {
	this.messageservice=messageservice;
}

public void sendMessage(String msg,String Rec) {
	messageservice.sendMessage(msg, Rec);
}
}
