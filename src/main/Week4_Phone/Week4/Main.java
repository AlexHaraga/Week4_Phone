package Week4;
import Week4.Phone.*;

public class Main {
    public static void main(String[] args) {
        SamsungS10e phone_1 = new SamsungS10e("Black", 10, "12323");
        SamsungS20 phone_2 = new SamsungS20("Red", 12, "123131");
        phone_2.createContact("Marcel", "0747848983");
        phone_1.createContact("Andrei", "0742828386");
        phone_1.sendMessage("Andrei", "Ce mai faci?");
        phone_2.sendMessage("Marcel", "Bine. Tu");
        phone_1.sendMessage("Andrei", "Bine. Uite încerc să termin tema asta.");
        phone_1.callContact("Andrei");
        phone_1.viewHistory();
        phone_1.viewMessages("Andrei");
    }
}