import javax.swing.*;

public class SevenDaySubscriber extends NewspaperSubscriber{

    public SevenDaySubscriber(){
        setRate();
    }
    public void setRate(){
        rate = 4.50;
    }
    public String toString(){
        return ("The street address is : " + streetAddress  +"\n"+ "The rate is : " +rate) ;
    }
}
