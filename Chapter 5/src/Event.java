public class Event {
    private String managerName;
    private double hourlyRate;
    private int typeOfEvent;
    //get
    String getManagerName(){
        return managerName;
    }
    double getHourlyRate(){
        return hourlyRate;
    }
    int getTypeOfEvent(){
        return typeOfEvent;
    }
    //set
    void setManagerName(String ManagerName){
        managerName = ManagerName;
    }
    void setHourlyRate(double eventRate){
        hourlyRate = eventRate;
    }
    void setTypeOfEvent(int eventType){
        typeOfEvent = eventType;
    }
}
