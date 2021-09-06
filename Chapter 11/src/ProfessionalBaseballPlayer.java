public class ProfessionalBaseballPlayer extends BaseballPlayer {
    double salary;
    //public void printOrigins(){

    //}
    /*public static void printOrigins(){
        super.printOrigins();
        System.out.println("The first professional " + "major league baseball game was played in 1871");
    }*/
    public static void printOrigins(){
        BaseballPlayer.printOrigins();
        System.out.println("The first professional " + "major league baseball game was played in 1871");
    }

}
