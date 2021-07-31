public class IntArray {
    public static void main(String[] args){
        int[] array = {1,2,3,4,5};
        for(int x=0; x < array.length; x++){
            System.out.println(array[x]);
        }
        System.out.println("\n");

        for(int y= array.length-1;y>=0;y--){
            System.out.println(array[y]);
        }
    }
}
