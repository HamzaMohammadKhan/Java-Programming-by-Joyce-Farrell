public class PassArray {
    public  static void main(String[] args){
        final int NUM_ELEMENTS = 4;
        int[] someNums = {5,10,15,20};
        int x;
        System.out.println("At start of  main : ");
        for(x = 0; x < NUM_ELEMENTS; x++){
            System.out.println(" " + someNums[x]);
            System.out.println();
        }
        for(x=0; x < NUM_ELEMENTS;++x){
            methodGetsOneInt(someNums, NUM_ELEMENTS);
            System.out.println("At the end of the main : ");
        }
        for(x=0;x<NUM_ELEMENTS;++x){
            System.out.println(" " + someNums[x]);
            System.out.println();
        }
    }
    public static void methodGetsOneInt(int arr[],int numEls){
        int x;
        System.out.println("At start of method arr holds : ");
        for(x=0; x< numEls; x++){
            System.out.println(" " + arr[x]);
        System.out.println();
        }
        for(x=0; x < numEls; ++x){
            arr[x] = 888;
        System.out.println(" and at end of method arr holds : ");
        }
        for(x=0; x<numEls; ++x){
            System.out.println(" " + arr[x]);
        System.out.println();
        }
    }
}
