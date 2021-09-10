#include<iostream>
#include<string>

using namespace std;

class Order{
    private:
    string name;
    int customerNumber;
    int quantityOrdered;
    int unitPrice;
    int totalPrice;

    public:
    string getName(){
        return name;
    }
    void setName(string n){
        name = n;
    }
    //
    int getCustomerNumber(){
        return customerNumber;
    }
    void setCustomerNumber(int n){
        customerNumber = n;
    }
    //
    int getQuantity(){
        return quantityOrdered;
    }
    void setQuatity(int q){
        quantityOrdered = q;
    }
    //
    int getUnitPrice(){
        return unitPrice;
    }
    void setUnitPrice(int u){
        unitPrice = u;
    }
    void displayPrice(){
        cout << " The quantity is : " << quantityOrdered << endl;

        cout << " The unit price is :" << unitPrice << endl;

        totalPrice = quantityOrdered * unitPrice;
        cout << " The total price is : " << totalPrice << endl;
    }
};

class ShippedOrder : public Order{
    public:
    void displayOrder(){
        cout << " The shipping price is : 4$" << endl;
    } 
};

int main(){
    ShippedOrder myOrder;
    myOrder.setName("Hamza");
    myOrder.setCustomerNumber(123);
    myOrder.setUnitPrice(122);
    myOrder.setQuatity(33);

    myOrder.displayPrice();
    myOrder.displayOrder();

}