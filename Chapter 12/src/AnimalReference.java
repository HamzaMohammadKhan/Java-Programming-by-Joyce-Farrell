public class AnimalReference {
    public static void main(String[] args){
        Animal ref;
        ref = new Cow();
        ref.speak();
        ref = new Dog();
        ref.speak();
    }
}
