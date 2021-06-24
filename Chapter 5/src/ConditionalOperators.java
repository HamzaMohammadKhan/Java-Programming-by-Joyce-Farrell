import javax.swing.JOptionPane;

public class ConditionalOperators {
    public static void main(String[] args){
        int advertisedPrice;
        int discountedPrice;
        String a, b;
        b = JOptionPane.showInputDialog(null, "Advertised price ");
        discountedPrice = Integer.parseInt(b);
        a = JOptionPane.showInputDialog(null, "Discounted price ");
        advertisedPrice = Integer.parseInt(a);
        int smallerNum = (advertisedPrice < discountedPrice) ? advertisedPrice : discountedPrice;
        JOptionPane.showMessageDialog(null, "The smaller number is " + smallerNum);
        System.exit(0);
    }
}
