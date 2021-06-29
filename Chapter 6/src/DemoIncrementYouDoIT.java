public class DemoIncrementYouDoIT {
    public static void main(String[] args){
       int v = 4;
       int vplusPlus = ++v;

       v = 4;
       int vPlusplus = v++;

       System.out.print(" v is "+ v);
        System.out.print("\n++v is "+ vplusPlus);
        System.out.print("\nv++ is " + vPlusplus);

        //DemoIncrement 2
        int w = 17, x= 17, y = 18;
        boolean compare1 = (++w == y);
        boolean compare2 = (x++ == y);

        System.out.print("\nFirst compare is " + compare1);
        System.out.print("\nSecond compare is " + compare2);
    }
}
