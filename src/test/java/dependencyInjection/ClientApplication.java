package dependencyInjection;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class ClientApplication {

	public static void main(String[] args) {
		Injector injector = Guice.createInjector(new AppModule());
		MessageService msgService = injector.getInstance(MessageService.class);
		msgService.sendMessage("Hi this is gururaj", "Gururaj");
	}

}
