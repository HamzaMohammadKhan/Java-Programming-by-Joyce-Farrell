public class Lawn {
    //season las 20 weeks
    //weekly fee for mowing under 400 = 20*20 sq ft is $25 per week
    // 400 or more but under 600 sq ft 35$ per week. Assume 500 = 25*20
    //600 sq ft 50$ per week = 30*20

    int length1,length2,length3;
    int width1,width2,width3;
    int weeklyFee1, weeklyFee2, weeklyFee3;
    int seasonalFee1, seasonalFee2, seasonalFee3;

    Lawn(){
        weeklyFee1 = 25;//under 400
        weeklyFee2 = 35;//500
        weeklyFee3 = 50;//600
    }
    int getLength1(){
        return length1;
    }
    int getLength2(){
        return length2;
    }
    int getLength3(){
        return length3;
    }
    int setLength1(int len1){
        length1 = len1;
        return len1;
    }
    int setLength2(int len2){
        length2 = len2;
        return len2;
    }
    int setLength3(int len3){
        length3 = len3;
        return len3;
    }
    int getWeeklyFee1(){
        return this.weeklyFee1;
    }
    int getWeeklyFee2(){
        return this.weeklyFee2;
    }
    int getWeeklyFee3(){
        return this.weeklyFee3;
    }
    int getWidth1(){
        return width1;
    }
    int getWidth2(){
        return width2;
    }
    int getWidth3(){
        return width3;
    }
    int setWidth1(int wid1){
        width1 = wid1;
        return wid1;
    }
    int setWidth2(int wid2){
        width2 = wid2;
        return wid2;
    }
    int setWidth3(int wid3){
        width3 = wid3;
        return wid3;
    }
    int getSeasonalFee1(){
        return seasonalFee1;
    }
    int getSeasonalFee2(){
        return seasonalFee2;
    }
    int getSeasonalFee3(){
        return seasonalFee3;
    }
    void setSeasonalFee1(int seas1){
        seasonalFee1 = seas1;
    }
    int setSeasonalFee2(int seas2){
        seasonalFee2 = seas2;
        return seas2;
    }
    int setSeasonalFee3(int seas3){
        seasonalFee3 = seas3;
        return seas3;
    }
}
