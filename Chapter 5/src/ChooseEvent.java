import javax.swing.JOptionPane;

public class ChooseEvent {
    public static void main(String[] args){
        String choiceString, chosenManager;
        int eventType;
        final String PRIV_MANAGER = "Dustin Britt";
        final String CORP_MANAGER = "Carmen Lindesy";
        final String NON_PROF_MANAGER = "Robin";
        final double PRIV_RATE = 47.99;
        final double CORP_RATE = 75.99;
        final double NON_PROF_RATE = 40.99;
        double rate;
        Event schdeduleEvent = new Event();
        choiceString = JOptionPane.showInputDialog(null, "what type of event you are schdeuling" + "\nEnter 1 for private,2 for corporate, 3 for Non Profit");
        eventType = Integer.parseInt(choiceString);

       /* if(eventType == 1){
            chosenManager = PRIV_MANAGER;
            rate = PRIV_RATE;
        }else{
            chosenManager = CORP_MANAGER;
            rate = CORP_RATE;
        } */
        /*if(eventType == 1){
            chosenManager = PRIV_MANAGER;
            rate = PRIV_RATE;
        }else if(eventType == 2){
            chosenManager = CORP_MANAGER;
            rate = CORP_RATE;
        }else{
            eventType = 999;
            chosenManager = "Unsigned";
            rate = 0.0;
        } */
        switch(eventType){
            case 1:
                chosenManager = PRIV_MANAGER;
                rate = PRIV_RATE;
                break;
            case 2:
                chosenManager = CORP_MANAGER;
                rate = CORP_RATE;
                break;
            case 3:
                chosenManager = NON_PROF_MANAGER;
                rate = NON_PROF_RATE;
                break;
            default:
                eventType = 999;
                chosenManager = "Unsigned";
                rate = 0.0;
        }
        schdeduleEvent.setTypeOfEvent(eventType);
        schdeduleEvent.setManagerName(chosenManager);
        schdeduleEvent.setHourlyRate(rate);

        JOptionPane.showMessageDialog(null, "Event type " + schdeduleEvent.getTypeOfEvent() + "\nManager for this event will be " + schdeduleEvent.getManagerName() + "\nThe hourly fee will be $ " + schdeduleEvent.getHourlyRate());
        System.exit(0);
    }
}
