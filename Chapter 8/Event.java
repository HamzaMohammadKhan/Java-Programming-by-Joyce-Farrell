public class Event {
    private int typeOfEvent;
    private double rate;
    private String manager;

    public Event(int eType){
        double[] rateSchedule = {0.0, 47.89, 75.99, 40.99};
        String[] managerList = {"x", "Dustin Britt", "Carmen Lindsey", "Robin Armanetti"};
        if(eType < rateSchedule.length){
            rate = rateSchedule[eType];
            manager = managerList[eType];
        }
    }

    public int getType(){
        return typeOfEvent;
    }
    public void setTypeOfEvent(){
        this.typeOfEvent = typeOfEvent;
    }

    public double getRate(){
        return rate;
    }
    public void setRate(){
        this.rate = rate;
    }

    public String getManager(){
        return manager;
    }
    public void setManager(){
        this.manager = manager;
    }
}
