public class EvenNums {
    public static void main(String[] args){
      int number;
      int NEW_LINE = 20;
      final int LIMIT = 100;

      for(number = 2; number <= LIMIT ; number++){
          System.out.println(number);
          if((number % NEW_LINE)==0)
          System.out.println("\n");
      }
    }
}
