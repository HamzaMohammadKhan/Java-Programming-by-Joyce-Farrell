public class Male extends Child{
    public Male(String name, String gender){ //only use name but error is being shown
        super(name, gender);
        setAge();
        }
    public void setAge(){
        age = 24;
    }
    public void display(){
        System.out.println("Your name is :" + name +"\n" +"Your gender : " + gender + "\n" + "Your age :" + age);
    }
}
