#include<iostream>

using namespace std;

class Year
{
    public:
    int numberOfDays;
    Year(){
        numberOfDays = 365;
    }
    void daysElasped(){
        int days;
        int months = 12;
        //string months[12] ={"Jan", "Feb", "March", "April", "May"}; 
        cout << " Enter days : ";
        cin >> days;
        int daysLeft = numberOfDays - days;
        cout << " The days left are : " << daysLeft << endl;
    }
};

class LeapYear : public Year
{
    public:
    LeapYear(){
        numberOfDays = 366;
    }
    void daysElasped(){
        int days;
        cout << " Enter days : ";
        cin >> days;
        int daysLeft = numberOfDays - days;
        cout << " The days left are : " << daysLeft << endl;
    }
};

int main(){
    Year y;
    LeapYear Ly;
    y.daysElasped();
    Ly.daysElasped();
}


