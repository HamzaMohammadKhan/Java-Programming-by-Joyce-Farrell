public class SumOf50 {
    public static void main(String[] args){
        int number;
        int sum = 0;
        System.out.println("sum of number 1 to 50 is : ");
        for(number = 1; number <= 50; number++){
           sum  += number;
        }
        System.out.println(sum);
    }
}
