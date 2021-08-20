import javax.swing.*;

public class JavaArray {
    public static void main(String[] args) {
        final int NUMBER_OF_REASONS = 5;
        String[] reasons = {"amazing", "oop", "methods", "libraries", "huge material"};
        String[] num = {"1", "2", "3", "4", "5"};
        boolean valid = false;
        String strStream = JOptionPane.showInputDialog(null, "Enter number");
        int intStream = Integer.parseInt(strStream);
        for (int a = 0; a < NUMBER_OF_REASONS; ++a) {
            if (reasons[a].equals(num[a])) {
                valid = true;
            }
            JOptionPane.showMessageDialog(null, "why because " + num[a] + " it is " + reasons[a]);
        }
    }
}



