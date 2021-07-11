import javax.swing.*;

public class BussinessLetter {
    public static void main(String[] args){
        String name;
        String firstName= "";
        String middleName = "";
        String familyName = "";
        int x;
        char c;
        name = JOptionPane.showInputDialog(null,"Please enter customer's first and last name");
        x = 0;
        while (x < name.length()){
            if (name.charAt(x) == ' '){
                firstName = name.substring(0,x);
                familyName = name.substring(x + 2, name.length());
                x = name.length();
            }
            ++x;
        }
        JOptionPane.showMessageDialog(null,"Dear " + firstName + "\nMiddle name " + middleName +  "\nI am so glad we arre on a first name basis" + "\n because i would like the opportunity to "+"\ntalk to you about an affordable insurance" + "\nfamily. Call A-one Family insurance today" +"\nprotetcion lan for the eniter " + familyName + "\nat 1-800-555-92878.");
        System.exit(0);
    }

}
