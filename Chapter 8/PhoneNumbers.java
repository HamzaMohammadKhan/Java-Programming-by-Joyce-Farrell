import javax.swing.*;

public class PhoneNumbers {
    public static void main(String[] args){
        final int FIRST_LENGTH = 10;
        String[] names = new String[30];
        int[] numbers = new int[30];
        final String quit = "QUIT";
        String enterName;
        int num = 0,x;
        int count =0, namesCount = 0;
        boolean isFound = false;
        enterName = JOptionPane.showInputDialog(null,"Enter name");
        for(x=0; x < names.length;++x){
            if(enterName.equals(names[x])){
                isFound = true;
                num = numbers[x];
            }
        }
        if(isFound){
            JOptionPane.showMessageDialog(null,"The contact " + enterName + " number is " + num);
        }else{
            JOptionPane.showMessageDialog(null,"Wrong entry");
        }
        while(count < FIRST_LENGTH) {
            names[count] = enterName;
            count++;
            if (isFound = false) {
                String newEntryNum, newEntryName;
                int newEntry1;
                newEntryNum = JOptionPane.showInputDialog(null, "Enter number : ");
                newEntry1 = Integer.parseInt(newEntryNum);
                newEntry1 = numbers[x];
                newEntryName = JOptionPane.showInputDialog(null, "Enter new name ");
                newEntryName = names[x];
            }

        }
        if (enterName.equalsIgnoreCase(quit)) {
            JOptionPane.showMessageDialog(null,"exit");
        }
    }
}
