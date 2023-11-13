package ro.scoalainformala;

import java.util.ArrayList;
import java.util.List;

public class Phone implements Phones{
    private List<Contact> contactList;
    private List<Message> messageList;
    private List<Call> callList;
    private int batteryLife;


    public Phone() {
        this.batteryLife=10;
        this.contactList=new ArrayList<>();
        this.messageList=new ArrayList<>();
        this.callList=new ArrayList<>();
    }
    @Override
    public void addContact(String position, String number, String firstName, String lastName){
        contactList.add(new Contact(position,number,firstName,lastName));
    }
    @Override
    public Contact getFirstContact(){
        return contactList.get(0);
    }
    @Override
    public Contact getLastContact(){
        return contactList.get(contactList.size()-1);
    }



    // SENDS MESSAGE TO FIRST CONTACT FROM PREVIOUSLY LISTED, AS REQUESTED IN THE ORIGINAL SENTENCE
    @Override
    public void sendMessage(String message){
        if (message.length() <= 500) {
            if (batteryLife >= 1) {
                messageList.add(new Message(getFirstContact().getNumber(), getLastContact().getNumber(), message));
                batteryLife -= 1;
            } else {
                System.out.println("~~~~~Insufficient battery~~~~~");
            }
        } else {
            System.out.println("~~~~~YOU HAVE ENTERED OVER 500 CHARS~~~~~");
        }
    }
    @Override
    public Message getFirstMessage(){
        return messageList.get(0);
    }
    @Override
    public Message getLastMessage(){
        return messageList.get(messageList.size()-1);
    }


    // CALLS THE FIRST CONTACT FROM PREVIOUSLY LISTED, AS REQUESTED IN THE ORIGINAL SENTENCE
    @Override
    public void call(){
        if(batteryLife>=2){
            callList.add(new Call(getLastContact().getNumber(),getFirstContact().getNumber()));
            batteryLife-=2;
        }else{
            System.out.println("~~~~~Insufficient battery~~~~~");
        }
    }
    @Override
    public void viewHistory(){
        for(Call x:callList){
            System.out.println(x);
        }
    }

    public int getBatteryLife() {
        return batteryLife;
    }
}
