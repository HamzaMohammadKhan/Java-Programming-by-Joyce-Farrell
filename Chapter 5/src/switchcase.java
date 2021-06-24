import javax.swing.JOptionPane;

public class switchcase
{
    public static void main(String[] args){
        int year;
        String Year;
        Year = JOptionPane.showInputDialog(null,"input year");
        year = Integer.parseInt(Year);

        switch(year){
            case 1:
                System.out.println("Freshman");
                break;
            case 2:
                System.out.println("Sophomore");
                break;
            case 3:
                System.out.println("junior");
                break;
            case 4:
                System.out.println("Senior");
                break;
            case 7:
                System.out.println("Get out of here man !");
                break;
            case 'w':
                System.out.println("hehe");//year should also be char
                break;

            default:
                System.out.println("does not match");
        }
    }
}
