import javax.swing.*;

public class LawFirm {
    public static void main(String [] args){
        Client obj1 = new Client();
        Client obj2 = new Client();
        Client obj3 = new Client();
        Client obj4 = new Client();
        Client obj5 = new Client();

        Attorney obj1A = new Attorney();
        Attorney obj2A = new Attorney();

        obj1.setBalance(121223);
        obj1.setPrimaryAttornyID(2);
        obj1.setFirstName("hamza");
        obj1.setLastName("mohammad Khan");
        obj1.setClientNumber(44);

        int num = obj1.getClientNumber();
        String fn = obj1.getFirstName();
        String ln = obj1.getLastName();
        double bal = obj1.getBalance();
        int ID = obj1.getPrimaryAttornyID();


        JOptionPane.showMessageDialog(null," The ID is : " + ID + "\n" + " The number is : " + num + "\n" + "The first name is : " + fn + "\n" + "The last name is : " + ln +
                "\n" + "The balance is : " + bal);

        obj1A.setAttorneyID(121);
        obj1A.setFirstName("Shoaib");
        obj1A.setLastName("Ashraf");
        obj1A.setSalary(12121344);

//Can do more//
    }
}
