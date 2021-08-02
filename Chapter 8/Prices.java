import java.util.Optional;

public class Prices {
    public static void main(String[] args){
        double[] prices = {2.39, 7.89, 1.34, 3.22, 4.22, 7.00, 23.33, 90.8, 2.99, 1.55, 2.55, 4.54, 3.66, 1.21, 4.44, 7.909, 1.33, 5.33, 6.99, 0.99};
        double sum = 0;
        double avg ;
        //1
        for(int x = 0; x< prices.length; x++){ // sum of array
            sum = sum + prices[x];
        }
        System.out.println(" The sum is : " + sum);
        //3
        avg = sum/ prices.length;
        System.out.println("The avg is : "  + avg);

        System.out.println("\n");

        //2
        System.out.println("The values below 5 are : ");
        for(double y : prices){ // Enhanced for loop can be read as "in".
            if(y<5){
                System.out.println(y);
            }
            //4
            System.out.println("The values below the avg are : ");
            for(double z : prices) {
            if(z<avg) {
                System.out.println(z);
            }
        }
}
}
}

