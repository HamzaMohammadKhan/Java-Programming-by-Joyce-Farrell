//Q.14
public class Circle {
    private double radius;
    private double Area;
    private double diameter;

    double getDiameter(){
        return diameter;
    }
    double getArea(){
        return Area;
    }
    double getRadius(){
        return radius;
    }
    void setRadius(double r){
      radius = r;
    }
    public Circle(){
        radius  = 1;

    }
    //d=2r
    public static void ComputeArea(double radius){
        double d;
        d = 2*radius;
         System.out.println("Your diameter is = " + d);
    }
    //A=pie*r^2
    public static void ComputeDiameter(double radius){
        double A;
        A = 3.142 * (radius*radius);
        System.out.println(" Your Area is =  " + A);
    }
}
