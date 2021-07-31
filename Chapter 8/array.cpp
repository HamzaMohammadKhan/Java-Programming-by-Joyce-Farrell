#include<iostream>

using namespace std;

int main(){
    int array[] = {1,2,3,4,5};

    for(int x = 0; x < 5;++x){
       cout << array[x] << endl;
    }

    size_t n = sizeof(array)/sizeof(array[0]);
    for(int i = n-1 ; i>=0 ;i--){
      cout<< array[i] <<endl;
}
}

