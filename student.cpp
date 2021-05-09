#include<iostream>

using namespace std;

class Student{
private:
 double ID_number;
 double credit_hours;
 double points_earned;

public:
    double getIDnumber(){
    return ID_number;
    }

    double getcredithours(){
    return credit_hours;
    }
    double getpointearned(){
    return points_earned;
    }

    Student(){
     ID_number = 9999;
     credit_hours = 3;
     points_earned = 12;
    }
};

int main(){
Student myObj;
double ID = myObj.getIDnumber();
double ch = myObj.getcredithours();
double pe = myObj.getpointearned();

double GPA = pe / ch;

cout << " Your id is =  " << ID << " \n Your credit hour = " << ch << " \n Your points earned =  " << pe << " \n Your GPA is = "<< GPA << endl;

return 0;
}
