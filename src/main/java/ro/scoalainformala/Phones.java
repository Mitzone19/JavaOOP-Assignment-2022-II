package ro.scoalainformala;

public interface Phones {
    public void addContact(String position, String number, String firstName, String lastName);
    public Contact getFirstContact();
    public Contact getLastContact();

    public void sendMessage(String message);
    public Message getFirstMessage();
    public Message getLastMessage();

    public void call();
    public void viewHistory();

    }