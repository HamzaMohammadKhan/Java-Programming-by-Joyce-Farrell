import javax.swing.*;

public class SearchList {
    public static void main(String[] args)
    {
        String[] deptName= {"Account", "Human Resources ", "Sales"};
        String dept;
        int x;
        boolean deptWasFound = false;
        dept = JOptionPane.showInputDialog(null, "Enter a department name");
        for(x = 0; x < deptName.length; ++x)
            if(dept.equals(deptName[x]))
                deptWasFound = true;
        if(deptWasFound)
            JOptionPane.showInputDialog(null, dept + " was found in the list");
        else
            JOptionPane.showMessageDialog(null, dept + " was not found ");
        System.exit(0);
    }
}
