
import java.util.ArrayList;

/**
 * This code is free to use, modify, and distribute under the MIT License.
 * See LICENSE file for details.
 * 
 * Course: https://java-programming.mooc.fi/
 *
 * @author Daniel Menke
 */
public class MessagingService {
    private ArrayList<Message> messages;
    
    public MessagingService() {
        this.messages = new ArrayList<>();
    }
    
    public void add(Message message) {
        if (message.getContent().length() <= 280) {
            messages.add(message);
        }
    }
    
    public ArrayList<Message> getMessages() {
        return messages;
    }
}
