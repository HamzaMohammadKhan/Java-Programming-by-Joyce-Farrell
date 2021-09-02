import javax.swing.*;
import java.awt.*;
import java.applet.*;

public class JHello extends JApplet{
    Container con = getContentPane();
    JLabel greeting = new JLabel("Hello, how are you ?");
    public void init() {
        con.add(greeting);
        }
}
