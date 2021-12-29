public abstract class Division {
    protected String name;
    protected int account_number;

    public Division(String n, int no){
        name = n;
        account_number = no;
    }

    public abstract void display();
}
