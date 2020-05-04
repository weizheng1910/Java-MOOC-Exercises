/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author weizheng
 */
public class MessagingService {

    private ArrayList<Message> messages;

    public MessagingService() {
        this.messages = new ArrayList<Message>();

    }

    public void add(Message message) {
        if(message.getContent().length() <= 280){
            messages.add(message);
        }
        
    }

    public ArrayList<Message> getMessages() {
        return this.messages;
    }

}
