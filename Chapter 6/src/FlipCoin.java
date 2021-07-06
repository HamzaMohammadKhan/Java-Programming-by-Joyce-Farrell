import java.lang.Math;

public class FlipCoin {
    public static void main(String[] args) {
        int heads = 0;
        int tails = 0;
        int tosses;
        for(tosses = 0;tosses < 10;tosses++){
            double result = Math.random();
            if(result <= 0.5)
                heads++;
            if(result >= 0.5)
                tails++;
        }
        System.out.println("Number of heads : " + heads + "\nNumber of tails : " + tails);

        //for 1000 tosses
        int heads1 = 0;
        int tails1 = 0;
        int tosses1;
        for(tosses1 = 0;tosses1 < 1000;tosses1++){
            double result1 = Math.random();
            if(result1 <= 0.5)
                heads1++;
            if(result1 >= 0.5)
                tails1++;
        }
        System.out.println("\nNumber of heads : " + heads1 + "\nNumber of tails : " + tails1);
    }
    }

