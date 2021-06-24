import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class PetAdvice {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int house, apartment, domitory;

        int hours;
        String inputHours, inputHouse;

        inputHouse = JOptionPane.showInputDialog(null,"Input house" + "\n" + "1. House" + "\n" + "2. Apartment" + "\n" + "3. Domitory");
        house = Integer.parseInt(inputHouse);
        apartment = Integer.parseInt(inputHouse);
        domitory = Integer.parseInt(inputHouse);

        inputHours = JOptionPane.showInputDialog(null, "Input the number of hours"+ "\n" + "1. 18 or more" + "\n" +"2. 10 to 17" +"\n"+"3. 8 to 9" + "\n" +"4. 6 to 7" +"\n"+"5. 0 to 5");
        hours = Integer.parseInt(inputHours);


        if(house == 1)
            if(hours >= 18)
            JOptionPane.showMessageDialog(null," You will be given a Pot-bellied Pig");


        if(house == 1)
            if(hours == 10 && hours < 17)
                JOptionPane.showMessageDialog(null, "You will be given a Dog");

        if(house == 1)
            if(hours < 10)
                JOptionPane.showMessageDialog(null, "You will be given a Snake");

        if(apartment == 2)
            if(hours > 10)
                JOptionPane.showMessageDialog(null,"You will be given a Cat");

        if(apartment == 2)
            if(hours < 10)
                JOptionPane.showMessageDialog(null,"You will be given a hamster");

        if(domitory == 3)
            if(hours > 6)
                JOptionPane.showMessageDialog(null,"You will be given a Fish");

        if(domitory == 3)
            if(hours < 6)
                JOptionPane.showMessageDialog(null,"You will be given a Ant Farm");
    }
}
