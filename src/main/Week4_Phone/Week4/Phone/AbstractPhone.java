package Week4.Phone;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public abstract class AbstractPhone implements PhoneOS {
    private final String color;
    private int baterrylife; //in hours
    private final String IMEI;
    private Map<String, String> contacts = new HashMap<>();
    private Map<String, List<String>> messages = new HashMap<>();
    private List<String> callHistory = new ArrayList<>();



    public AbstractPhone(String color, int baterrylife, String IMEI) {
        this.color = color;
        this.baterrylife = baterrylife;
        this.IMEI = IMEI;
    }

    public String getColor() {
        return color;
    }

    public int getBaterrylife() {
        return baterrylife;
    }

    public String getIMEI() {
        return IMEI;
    }

    @Override
    public void callContact(String contactName) { //would be interesting to add a time factor to calling method
                                //also would be interesting to add an answering method
                                // e.g. a phone starts calling another phone
        if(contacts.containsKey(contactName)){
            callHistory.add("Call made to: " + contactName);
            baterrylife -= 2;
            System.out.println("Calling " + contactName);
        } else {
            System.out.println("Could not make call to " + contactName);
        }
    }

    @Override
    public void createContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }
    @Override
    public void viewContacts() {
        System.out.println("Contacts:");
        for(Map.Entry<String, String> entry: contacts.entrySet()){
            System.out.println(entry.getKey() + ":" + entry.getValue());
        }
    }
    @Override
    public void sendMessage(String contactName, String message) {
        if(message.length() <= 500 && contacts.containsKey(contactName)){
            messages.computeIfAbsent(contactName, k -> new ArrayList<>()).add(message); //Change here
            baterrylife--;
            System.out.println("Message sent to " + contactName);
        } else {
            System.out.println("Message could not be sent");
        }
    }
    @Override
    public void viewHistory() {
        System.out.println("Call history:");
        for (String call : callHistory){
            System.out.println(call);
        }
    }
    @Override
    public void viewMessages(String contactName){
        if(messages.containsKey(contactName)){
            System.out.println("Messages with " + contactName + ":");
            for(String message : messages.get(contactName)){
                System.out.println(message);
            }
        } else {
            System.out.println("No messages with " + contactName);
        }
    }
}

