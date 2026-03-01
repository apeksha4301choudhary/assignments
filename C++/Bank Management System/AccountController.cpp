#include <iostream>
#include "Customer.h"
#include "Account.h"
using namespace std;

int main() {
    Account ac;

    cout<<"Press 1 : Create Your Account "<<endl;
    cout<<"Press 2 : View Your Account "<<endl;
    cout<<"Press 3 : Check Balance "<<endl;
    cout<<"Press 4 : Deposite Money "<<endl;
    cout<<"Press 5 : Withdraw Money "<<endl;
    cout<<"Press 6 : Update Your Account "<<endl;
    cout<<"Press 7 : Exit! "<<endl;

    int choice;
    cin>>choice;

    switch (choice)
    {
    case 1:
        ac.createAccount();
        break;

    case 2:
        ac.viewAccount();
        break;

    case 3:
        ac.checkBalance();
        break;

    case 4:
        ac.depositeMoney();
        break;

    case 5:
        ac.withdrawMoney();
        break;

    case 6:
        ac.updateMoney();
        break;
        
    case 7:
        cout<<"Visit Again!!!";
        break;
    
    default: cout<<"Invalid Choice! Try Again.";
        break;
    }

}