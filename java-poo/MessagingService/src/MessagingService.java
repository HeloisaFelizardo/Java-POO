
import java.util.ArrayList;

public class MessagingService {

    // Lista para armazenar as mensagens
    private ArrayList<Message> messages;

    // Construtor que inicializa a lista de mensagens
    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    // Adiciona uma mensagem ao serviço, verificando se o conteúdo tem no máximo 280 caracteres
    public void add(Message message) {
        // Verifica se a mensagem não é nula e se o conteúdo tem no máximo 280 caracteres
        if (message != null && message.getContent().length() <= 280) {
            // Adiciona a mensagem à lista
            this.messages.add(message);
        }
    }

    // Retorna uma cópia da lista de mensagens
    public ArrayList<Message> getMessages() {
        return new ArrayList<>(messages);
    }
}
