package ro.scoalainformala;

public class Contact{
    private String number;
    private String firstName;
    private String lastName;
    private String position;
    public Contact(String position,String number,String firstName,String lastName) {
        this.position=position;
        this.number=number;
        this.firstName=firstName;
        this.lastName=lastName;
    }

    public String getNumber() {
        return number;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPosition() {
        return position;
    }

    public String toString(){
        return "Name: "+firstName+" "+lastName+" Number: "+number;
    }

}
