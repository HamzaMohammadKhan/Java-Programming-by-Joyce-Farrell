import javax.swing.*;

public class DinnerEvent {
    int dinnerChoice;

    public void displayDinnerChoice()
    {
        if(dinnerChoice == 1){
            JOptionPane.showMessageDialog(null, " Dinner choice is chicken ");
        }else{
            JOptionPane.showMessageDialog(null,"Dinner choice is Chicken");
        }
    }
    public void setDinnerChoice(){
        String choice;
        choice = JOptionPane.showInputDialog(null,"Enter dinner choice \n 1. for beef \n 2. for chicken");
        dinnerChoice = Integer.parseInt(choice);
    }
}
