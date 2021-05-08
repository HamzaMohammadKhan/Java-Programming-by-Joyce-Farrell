//Q.13
// total point earned / total credit hours attempted = GPA

public class ShowStudent {
    public static void main(String[] args){
        Studentclas student = new Studentclas();
        double ch;
        double ID;
        double pe;

        ch = student.getCredit_hours();
        ID = student.getID_number();
        pe = student.getPoints_earned();

        double GPA = pe /ch;
        System.out.println(" Your ID number is =  " + ID + " \n Your GPA is =  " + GPA);

    }
}
