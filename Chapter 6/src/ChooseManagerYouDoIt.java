import javax.swing.*;

public class ChooseManagerYouDoIt {
    public static void main(String[] args){
        String choiceString, chosenManager;
        int eventType;
        final String PRIV_MANAGER = "Dustin Britt";
        final String CORP_MANAGER = "Carmen Lindsey";
        choiceString = JOptionPane.showInputDialog(null,"What type of event you are schdeuling?" + "\nEnter 1 for private ,2 for corporate");
        eventType = Integer.parseInt(choiceString);
        while(eventType !=1 && eventType != 2){
            choiceString = JOptionPane.showInputDialog(null,"Invalid entry. You must choose 1 or 2" + "\nEnter 1 for Private , 2 for Corporate");
            eventType = Integer.parseInt(choiceString);
        }
        if(eventType == 1) {
            chosenManager = PRIV_MANAGER;
        }else{
                chosenManager = CORP_MANAGER;
            }
        JOptionPane.showMessageDialog(null,"Manager for this event will be " + chosenManager);
        System.exit(0);
        }
    }
