
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {
        MessagingService messagingService = new MessagingService();

        Message message1 = new Message("Sender1", "Hello, how are you?");
        Message message2 = new Message("Sender2", "This is a short message.");
        Message message3 = new Message("Sender3", "This is another message.");

        messagingService.add(message1);
        messagingService.add(message2);
        messagingService.add(message3);

        // Printando as mensagens adicionadas ao serviço
        ArrayList<Message> receivedMessages = messagingService.getMessages();
        for (Message msg : receivedMessages) {
            System.out.println(msg);
        }

    }
}
