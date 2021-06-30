//incomplete
import java.util.Scanner;

public class Input123 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");

        int number;
        number = sc.nextInt();
        for(;number<4;number++){
            System.out.println("Good Job");
            if(number == 4)
                System.out.println();
            continue;
        }if(number > 4)
            System.out.println("Error");
        }
}
