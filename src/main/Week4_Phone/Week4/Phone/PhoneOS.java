package Week4.Phone;

public interface PhoneOS {
    public void createContact(String name, String phoneNumber);
    public void viewContacts();
    public void sendMessage(String contactName, String message);
    public void callContact(String contactName);
    public void viewHistory();
    public void viewMessages(String contactName);
}
