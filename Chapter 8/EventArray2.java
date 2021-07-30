import javax.swing.*;

public class EventArray2 {
    public static void main(String[] args){
        String[] eventTypes = {" ", "Private", "Corporate", "Non-Profit"};
        String choiceString = " ";
        int selectedEvent;
        String strSelectedEvent;
        Event[] someEvent = new Event[5];
        int x;
        for(x=1;x<eventTypes.length;++x){
            choiceString = choiceString + " \n" + x + " " + eventTypes[x];
        }
        for(x=0; x< someEvent.length;++x){
            strSelectedEvent = JOptionPane.showInputDialog(null,"Event #" + (x+1)+ " Enter the number for the type of event you want " + choiceString);
            selectedEvent = Integer.parseInt(strSelectedEvent);
            if(selectedEvent < 1 || selectedEvent > 3){
                selectedEvent = 0;
            }
            someEvent[x] = new Event(selectedEvent);
        }
        for(x=0;x<someEvent.length;++x){
            System.out.println(someEvent[x].getType() + " " + eventTypes[someEvent[x].getType()] + " " + someEvent[x].getRate()+ " " +someEvent[x].getManager());
        }
        System.exit(0);
    }

}
