//incomplete ( can't check users inputs )

import javax.swing.JOptionPane;

public class Survey {
    public static void main(String[] args) {
        String q1, q2, q3, q4;
        int surveyQuestion1, surveyQuestion2, surveyQuestion3, surveyQuestion4, selection;
        do {
            q1 = JOptionPane.showInputDialog(null, "How you feel" + "\n1. Good" + "\n2. Alright" + "\n3. Bad");
            surveyQuestion1 = Integer.parseInt(q1);

            q2 = JOptionPane.showInputDialog(null, "How is family" + "\n1. Good" + "\n2. Alright" + "\n3. Bad");
            surveyQuestion2 = Integer.parseInt(q2);

            q3 = JOptionPane.showInputDialog(null, "How is home" + "\n1. Good" + "\n2. Alright" + "\n3. Bad");
            surveyQuestion3 = Integer.parseInt(q3);

            q4 = JOptionPane.showInputDialog(null, "How is your life" + "\n1. Good" + "\n2. Alright" + "\n3. Bad");
            surveyQuestion4 = Integer.parseInt(q4);

            selection = JOptionPane.showConfirmDialog(null, "Do you want to set another response ?");
        } while (selection == JOptionPane.YES_OPTION);
        if (selection == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "The people choose " + surveyQuestion1 + " the most from the first question ");
                JOptionPane.showMessageDialog(null, "The people choose " + surveyQuestion2 + " the most from the second question ");
                JOptionPane.showMessageDialog(null, "The people choose " + surveyQuestion3 + " the most from the third question ");
                JOptionPane.showMessageDialog(null, "The people choose " + surveyQuestion4 + " the most from the fourth question ");
        }
        }
    }
