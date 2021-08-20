import javax.swing.*;
import java.util.Arrays;

public class StudentIDArray {
    public static void main(String[] args){
        final int TOTAL = 5;
        int[] Id = {111,222,333,444,555};
        double[] gpa = {2.42,3.0,4,3.5,2.8};
        String[] names = {"hamza","ali","umair","aqib","shah"};
        String stuID, student = "";
        boolean valid = false;
        double cgpa = 0.0;
        int x;
        stuID = JOptionPane.showInputDialog(null," enter ID : ");
        int stuID1 = Integer.parseInt(stuID);
        for(x=0; x < TOTAL; ++x){
            for(int y=0; y < names.length; ++y)
            if(stuID1 == Id[x])
            {
                student = names[x];
                valid = true;
                cgpa = gpa[x];
            }
        }
        if(valid){
            JOptionPane.showMessageDialog(null, " The student is : " + student + "\n" + " Roll number : " + stuID1 + "\n" + " marks : " + cgpa);
        }else{
            JOptionPane.showMessageDialog(null,"wrong entry");
        }
    }

}
