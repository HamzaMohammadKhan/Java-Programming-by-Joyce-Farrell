#include<iostream>

using namespace std;

class CollegeCourse{
    protected:
    string department;
    int courseNumber;
    int creditHours;
    int totalfee;
    
    public:
    CollegeCourse(string dpt, int num, int hour){
        department = dpt;
        courseNumber = num;
        creditHours = hour;
        totalfee = hour * 120;
        }
        void display(){
            cout << "The department is : " << department << endl;
            cout << "The course number is : " << courseNumber << endl;
            cout << "The credit hours are : " << creditHours << endl;
            cout << "The total fee is : " << totalfee << endl;
        }
};

class LabCourse : public CollegeCourse{
    public:
    LabCourse(string dpt, int num, int hour) : CollegeCourse( dpt, num, hour){
        totalfee = (hour * 120 ) + 50;
    } // base classs calling in derived
    void display(){ 
        cout << "this is a lab course " << endl;
        cout << " the total fee is : " << totalfee << endl;
    }    
};

int main(){
    string dept;
    int cred, num;
    
    cout << "Enter department : ";
    cin >> dept;

    cout << " Enter credit hours : ";
    cin >> cred;

    cout << "Enter course number : ";
    cin >> num;

    if(dept == "BIO" || dept == "CHM" || dept == "CIS" || dept == "PHY"){
         LabCourse cour = LabCourse(dept, cred, num);
         cour.display();
    }else{
        cout << "\n" << endl;
        CollegeCourse cour1 = CollegeCourse(dept, cred, num);
        cour1.display();
    }    
}