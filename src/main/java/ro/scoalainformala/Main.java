package ro.scoalainformala;
import ro.scoalainformala.Samsung.SamsungGalaxy6;
import ro.scoalainformala.Samsung.SamsungGalaxy7;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Phone phone = new SamsungGalaxy6();
        Phone phone1=new SamsungGalaxy7();
        System.out.println("Initial battery cappacity in hours: "+phone.getBatteryLife()+"\n");
        phone.addContact("1", "0765123551", "Andrei", "Ciobanu");

        phone.addContact("2", "07666152131", "Daniel", "Cristescu");

        phone.getFirstContact();
        System.out.println(phone.getFirstContact());
        phone.getLastContact();
        System.out.println(phone.getLastContact());
        System.out.println();

        phone.sendMessage("VERY IMPORTANT MESSAGE, CALL ASAP");
        phone.sendMessage("NO NEED TO HURRY");

        System.out.println(phone.getFirstMessage());
        System.out.println();

        System.out.println(phone.getLastMessage());
        System.out.println();

        phone.call();
        phone.call();
        phone.call();


        phone.viewHistory();
        System.out.println("FINAL battery cappacity in hours: "+phone.getBatteryLife()+"\n");
        System.out.println("~~~~~END~~~~~");

    }
}