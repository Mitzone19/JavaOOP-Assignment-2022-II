package ro.scoalainformala;

public class Message {
    private String senderNumber;
    private String receiverNumber;
    private String message;
    public Message(String senderNumber, String receiverNumber, String message){
        this.senderNumber=senderNumber;
        this.receiverNumber=receiverNumber;
        this.message=message;
    }

    public String getSender() {
        return senderNumber;
    }

    public String getReceiver() {
        return receiverNumber;
    }

    public String getMessage() {
        return message;
    }

    public String toString(){
        return "Sender: "+senderNumber+"| Receiver: "+receiverNumber+"\n Message: "+message;
    }
}
