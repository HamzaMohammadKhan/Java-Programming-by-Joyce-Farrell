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
        totalfee = creditHours * 120;
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
    typedef CollegeCourse super;
    LabCourse(string dpt, int num, int hour){
        super::display();   
    }
    void display(){
        cout << "this is a lab course " << endl;
    }    
};

int main(){
    string dept;
    int cred, num;

    CollegeCourse CollCou1 = CollCou(dept,num,cred);
    
    cout << "Enter department : ";
    cin >> dept;

    cout << "Enter course number : ";
    cin >> num;

    cout << " Enter credit hours : ";
    cin >> cred;

    switch(dept){
        case "BIO":
        
    }
}
