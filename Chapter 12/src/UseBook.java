public class UseBook {
    public static void main(String[] args){
        Fiction obj1 = new Fiction();
        NonFiction obj2 = new NonFiction();

        System.out.println("The price of fictions book are " + obj1.getBookPrice());
        System.out.println("The price of Non Fiction Books are " + obj2.getBookPrice());

    }
}
