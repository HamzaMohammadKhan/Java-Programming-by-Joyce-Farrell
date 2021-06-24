import javax.swing.*;

public class Admission {
 //gpa
 //admissiontestscore
    public static void main(String[] args){
        double cgpa;
        int admissionScore;
        String uniCgpa, uniTestScore;

        uniCgpa = JOptionPane.showInputDialog(null, "Enter CGPA ");
        cgpa = Double.parseDouble(uniCgpa);

        uniTestScore = JOptionPane.showInputDialog(null, "Enter Test Score");
        admissionScore = Integer.parseInt(uniTestScore);

        if(cgpa == 0 && admissionScore == 0) {
            JOptionPane.showMessageDialog(null, "Error!");
        }
        if(cgpa >= 3.0  && admissionScore >= 60 ) {
                JOptionPane.showMessageDialog(null, "You are accepted");
        } if(cgpa < 3.0 && admissionScore >= 80 ){
            JOptionPane.showMessageDialog(null, "You are accepted");
        }else{
            JOptionPane.showMessageDialog(null, "You are Rejected");
        }
        System.exit(0);
    }
}
