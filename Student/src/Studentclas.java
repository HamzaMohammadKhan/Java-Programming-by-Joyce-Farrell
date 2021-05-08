//Q.13

public class Studentclas {
    private double ID_number;
    private double credit_hours;
    private double points_earned;

    public double getID_number() {
        return ID_number;
    }

    public double getCredit_hours() {
        return credit_hours;
    }

    public double getPoints_earned() {
        return points_earned;
    }
 /** when making constructor like below don't use setters because they retrive value and getter read values and values are give */

    public Studentclas(){ //default constructor, a constructor is method that creates objects
        ID_number = 9999;
        credit_hours = 3;
        points_earned = 12;
    }
}
