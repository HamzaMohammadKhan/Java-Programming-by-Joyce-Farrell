#include<iostream>

using namespace std;

int main(){
 int number;
 int LIMIT = 100;
 for(number = 2; number <= LIMIT; number++){
 cout<<number<<endl;
 if((number % 20)==0){
 cout<<"\n"<<endl;
 }
 }
}
