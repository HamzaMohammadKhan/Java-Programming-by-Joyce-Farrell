//Q.17

public class Meeting {
    private String day;
    private int week;
    private int startTime;
    private int endTime;

    //1
    String getDay(){
        return day;
    }
    void setDay(String d){
        day = d;
    }
    //2
    int getWeek(){
        return week;
    }
    void setWeek(int w){
        week = w;
    }
    //3
    int getStartTime(){
        return startTime;
    }
    void setStartTime(int st){
        startTime = st;
    }
    //4
    int getEndTime(){
        return endTime;
    }
    void setEndTime(int et){
        endTime = et;
    }
    public void Display(){
        System.out.println("The day of the meeting is  : " + day + "\n The week is : " + week + "\n The start time is : " + startTime + "am" + " \n The end time will be : " + endTime + "pm");
    }
}
