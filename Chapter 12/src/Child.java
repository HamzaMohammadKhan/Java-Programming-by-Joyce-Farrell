public abstract class Child {
    protected String name;
    protected String gender;
    protected int age;

    public Child(String n, String g){
        name = n;
        gender = g;
    }

    public abstract void setAge();
    public abstract void display();
}
