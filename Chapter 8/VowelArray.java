import javax.swing.*;
import java.util.Arrays;

public class VowelArray {
    public static void main(String[] args) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        char myVowels;
        int position;
        String entry = JOptionPane.showInputDialog(null, "Enter student grade");
        myVowels = entry.charAt(0);
        position = Arrays.binarySearch(vowels, myVowels);
        if (position >= 0)
            JOptionPane.showMessageDialog(null, " The vowel entered is " + myVowels);
        else
            JOptionPane.showMessageDialog(null, " UpperCase invalid ");
        System.exit(0);
    }
    //for uppercase
    public static void vowelArray2(){
        char[] vowelsUpper = {'A', 'E', 'I', 'O', 'U'};
        char myVowels;
        int position;
        String entry = JOptionPane.showInputDialog(null, "Enter student grade");
        myVowels = entry.charAt(0);
        position = Arrays.binarySearch(vowelsUpper, myVowels);
        if (position >= 0)
            JOptionPane.showMessageDialog(null, " The vowels entered is " + myVowels);
        else
            JOptionPane.showMessageDialog(null, " LowerCase invalid ");
        System.exit(0);
    }

}
