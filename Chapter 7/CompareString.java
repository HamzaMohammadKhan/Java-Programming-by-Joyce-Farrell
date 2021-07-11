import javax.swing.*;

public class CompareString {
    public static void main(String[] args){
        String aName = "Carmen";
        String anotherName;
        anotherName = JOptionPane.showInputDialog(null,"Enter your Name : ");
        if(aName.equals(anotherName)){
            JOptionPane.showMessageDialog(null,aName + " equals " + anotherName);
        }else{
            JOptionPane.showMessageDialog(null, aName + " does not equal " + anotherName);
        }
        System.exit(0);
    }
}
