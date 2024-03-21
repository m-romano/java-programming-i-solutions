import java.util.ArrayList;
public class MessagingService {
    ArrayList<Message> messages = new ArrayList<>();

    public MessagingService() {
        this.messages = new ArrayList<>();
    }

    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }

    public ArrayList<Message> getMessages() {
        System.out.println(messages);
        return messages;
    }
}
