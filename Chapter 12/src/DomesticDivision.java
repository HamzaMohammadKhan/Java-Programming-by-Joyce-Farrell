import com.sun.source.doctree.SystemPropertyTree;

public class DomesticDivision extends Division{
    String location;

    public DomesticDivision(String name, int num, String loc){
        super(name, num);
        location = loc;
    }
    public void display(){
        System.out.println("Your name : " + name + "\n" + "Your account number :" + account_number +"\n" + "Your location : "+ location);
    }
}
