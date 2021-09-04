import javax.swing.*;
import java.awt.*;

public class JHello2 extends JApplet {
    Container con = getContentPane();
    JLabel greeting = new JLabel("Hello. Who are you?");
    Font headlineFont = new Font("Helvetica",Font.BOLD,36);
    public void init(){
        greeting.setFont(headlineFont);
        con.add(greeting);
    }
    public static void main(String[] args){

    }
}
