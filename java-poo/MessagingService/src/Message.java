
import java.util.Objects;

public class Message {
    // Atributos que representam o remetente e o conteúdo da mensagem
    private String sender;
    private String content;

    // Construtor que inicializa a mensagem com remetente e conteúdo
    public Message(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    // Método para obter o remetente da mensagem
    public String getSender() {
        return sender;
    }

    // Método para obter o conteúdo da mensagem
    public String getContent() {
        return content;
    }

    // Retorna uma representação em string da mensagem no formato "Remetente: Conteúdo"
    public String toString() {
        return this.sender + ": " + this.content;
    }

    // Sobrescrita do método equals para comparar duas mensagens
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Message other = (Message) obj;
        if (!Objects.equals(this.sender, other.sender)) {
            return false;
        }
        if (!Objects.equals(this.content, other.content)) {
            return false;
        }
        return true;
    }

}
