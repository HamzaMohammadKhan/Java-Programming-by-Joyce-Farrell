public class AnimalArrayDemo {
    public static void main(String[] args){
        Animal[] ref = new Animal[3];
        ref[0] = new Dog();
        ref[1] = new Cow();
        ref[2] = new Snake();
        for(int x=0; x < 3; x++){
            ref[x].speak();
        }
    }
}
