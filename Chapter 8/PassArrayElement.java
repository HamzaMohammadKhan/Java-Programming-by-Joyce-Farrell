public class PassArrayElement {
    public static void main(String[] args){
        final int NUM_ELEMENTS = 4;
        int[] someNums = {5,10,15,20};
        int x;
        System.out.println("At start of  main : ");
        for(x = 0; x < NUM_ELEMENTS; x++){
            System.out.println(" " + someNums[x]);
            System.out.println();
        }
        for(x=0; x < NUM_ELEMENTS;++x){
            methodGetsOneInt(someNums[x]);
            System.out.println("At the end of the main : ");
        }
        for(x=0;x<NUM_ELEMENTS;++x){
            System.out.println(" " + someNums[x]);
            System.out.println();
        }
    }
    public static void methodGetsOneInt(int one){
        System.out.println("At start o method one is : " + one );
        one = 999;
        System.out.println(" and at the end of megthod one is : " + one);
    }
}
