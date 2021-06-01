public class Commision {
    private double salesFigure;
    private double commisionRate;
    private int commisionRate1;

    public static void computeCommision(double sales, double rate){
        double result;
        result = sales  * rate;
        System.out.println(" The result is = " + result);
    }
    public static void computeCommision(double salesFigure, int commisionRate1){
        double initialCommision;
        initialCommision = commisionRate1 / 100.0;

        double totalCommision;
        totalCommision = initialCommision * salesFigure;
        System.out.println("The total commision is = " + totalCommision);
    }
    public static void main(String[] args){
        computeCommision(12.5,33.5);
        computeCommision(11.4, 32);
    }
}
