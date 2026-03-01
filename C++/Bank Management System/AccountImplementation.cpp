#include <iostream>
#include "Account.h"
#include "Customer.h"
using namespace std;

 Customer c;
 Account ac;
void Account::createAccount() {
    //name
    string n;
    cout << "Enter Your Name: ";
    cin>>n;
    c.setName(n);

    //id
    int i_d;
    cout << "Enter Your Password: ";
    cin>>i_d;
    c.setId(i_d);

    //account
    string acc_typ;
    cout << "Enter Account Type : ";
    cin>>acc_typ;
    c.setAccountType(acc_typ);

    //address
    string addrs;
    cout << "Enter Your Address: ";
    cin>>addrs;
    c.setAddress(addrs);

    //branch
    string brn;
    cout << "Enter Your Branch: ";
    cin>>brn;
    c.setBranch(brn);

    //balance
    double bln;
    cout << "Enter Your Balance: ";
    cin>>bln;
    c.setBalance(bln);

}

void Account::viewAccount(){}
void Account::checkBalance(){}
void Account::depositeMoney(){}
void Account::withdrawMoney(){}
void Account::updateMoney(){}