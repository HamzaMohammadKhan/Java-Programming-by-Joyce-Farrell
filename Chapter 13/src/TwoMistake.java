public class TwoMistake {
    public static void main(String[] args){
        int num[] = {4,0,0};
        try{
            num[2] = num[0] / num[1];
            num[2] = num[3] / num[0];
        }
        catch(ArithmeticException e){
            System.out.println("Arthmetic error");
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("out of bounds");
        }
        System.out.println("End of program");
    }
}
