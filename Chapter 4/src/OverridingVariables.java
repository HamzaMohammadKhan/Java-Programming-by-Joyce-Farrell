public class OverridingVariables {
    public static void main(String[] args){
        int aNumber = 10;
        System.out.println("In main(),aNumber is" + aNumber );
        firstMethod();
    }
    public static void firstMethod(){
        int aNumber = 77;
        System.out.println("In firstMethod(),aNumber is" + aNumber );
    }

}
