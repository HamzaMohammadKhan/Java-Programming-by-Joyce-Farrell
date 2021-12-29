public class Female extends Child{
    public Female(String name, String gender){
        super(name,gender);
        setAge();
    }
    public void setAge() {
        age = 23;
    }

    public void display(){
        System.out.println("Your name is :" + name + "\n" + "Your gender : " + gender  + "\n" + "Your age is : " + age);
    }
}
