import javax.swing.*;

public class Event {
    private int eventGuests;
    public void displayGuestsEvents(){
        JOptionPane.showMessageDialog(null, "Event guests: " + eventGuests);
    }
    public void setEventGuests(){
        char inChar;
        String guestString =  new String();
        guestString = JOptionPane.showInputDialog(null,"Enter the number of guests at event ");
        eventGuests = Integer.parseInt(guestString);
    }
    public void displayPricingInfo()
    {
        JOptionPane.showMessageDialog(null,"Events cost $100 per hour \n" + "There is a three-hour minimum");
    }
}
