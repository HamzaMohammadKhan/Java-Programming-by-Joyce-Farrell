public class DivideEvenlyYouDoIt {
     public static void main(String[] args){
         final int NUMBER = 100;
         int var;
         System.out.println(NUMBER + " is evenly divisible by ");
         for(var = 1; var <= NUMBER; ++var) {
             if (NUMBER % var == 0) {
                 System.out.println(var + " ");
             }
         }
             System.out.println();
     }
}
