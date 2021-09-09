import java.util.Scanner;

public class Square {
    private int height;
    private int width;
    private int surfaceArea;

    public void ComputeSurfaceArea()
    {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter height : ");
        height = sc.nextInt();
        System.out.println("enter width : ");
        width = sc.nextInt();
        surfaceArea = height*width;
        System.out.println("The surface area is : " + surfaceArea);
    }
}
