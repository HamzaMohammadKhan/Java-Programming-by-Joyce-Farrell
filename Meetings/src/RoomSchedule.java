public class RoomSchedule {
    public static void main(String[] args){
        Meeting Obj1 = new Meeting();
        Meeting Obj2 = new Meeting();

        System.out.println("The first meeting will be : \n");
        Obj1.setDay("Monday");
        Obj1.setWeek(3);
        Obj1.setStartTime(12);
        Obj1.setEndTime(3);
        Obj1.Display();

        System.out.println("\n The second meeting will be : \n");
        Obj2.setDay("Saturday");
        Obj2.setWeek(3);
        Obj2.setStartTime(11);
        Obj2.setEndTime(3);
        Obj2.Display();
    }
}
