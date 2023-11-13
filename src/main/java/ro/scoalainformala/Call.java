package ro.scoalainformala;

import javax.naming.ldap.Control;

public class Call {
    private String sender;
    private String receiver;

    public Call(String sender, String receiver){
        this.sender=sender;
        this.receiver=receiver;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String toString(){

        return "A call was made by "+sender+" to "+receiver;
    }
}
