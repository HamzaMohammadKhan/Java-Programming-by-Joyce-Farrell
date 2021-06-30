import java.math.*;

public class TableOfSquares {
    public static void main(String[] args){
        int number;
        int square;
        for(number = 1; number <= 20; number++){
            square = number *number;
            System.out.println(number + " " + square);
        }
    }
}
