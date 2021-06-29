public class DivideEvenlyDoIt2 {
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

        final int LIMIT = 100;
        int number;
        System.out.println(NUMBER + " is evenly divisible by ");
        for(number = 1; number <= LIMIT; ++number){
            System.out.println(number + " is evenly dividble by ");
            for(var = 1; var <= number; ++var)
                if(number % var == 0)
                    System.out.println(var + " ");
            System.out.println();
        }
    }
}
