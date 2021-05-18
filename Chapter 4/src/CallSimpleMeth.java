public class CallSimpleMeth {
    public static void main(String[] args){
        double doubleValue = 45.67;
        int intValue = 17;
        simpleMeth(intValue, doubleValue);
        simpleMeth(doubleValue ,intValue);
    }
    public static void simpleMeth(int bal,double rate){
        System.out.println("Method receives double parameter = " );
    }
    public static void simpleMeth(double bal, int rate){
        System.out.println("Method receives integer parameter =");
    }
}
