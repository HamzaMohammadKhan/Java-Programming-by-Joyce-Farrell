import javax.swing.*;

public class WeekEndSubsriber extends NewspaperSubscriber{
    public WeekEndSubsriber(){
        setRate();
    }
    public void setRate(){
        rate = 2.00;
    }
    public String toString(){
        return ("The street address is : " + streetAddress  +"\n"+ "The rate is : " +rate) ;
    }
}
