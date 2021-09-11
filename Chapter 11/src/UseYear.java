import jdk.jshell.execution.LocalExecutionControlProvider;

public class UseYear {
    public static void main(String[] args){
        Year obj1 = new Year();
        LeapYear obj2 = new LeapYear();

        obj1.daysElapsed();
        obj2.daysElapsed();
    }
}
