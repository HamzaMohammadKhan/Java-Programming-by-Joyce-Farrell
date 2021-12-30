import javax.swing.*;
import java.util.Objects;

public abstract class NewspaperSubscriber {
    protected String streetAddress;
    protected double rate;

    public String getStreetAddress(){
        return streetAddress;
    }
    public double getRate(){
        return rate;
    }

    public void setStreetAddress(){
        streetAddress = JOptionPane.showInputDialog(null,"Enter address");
    }
    public abstract void setRate();


}
