#ifndef SRC_CUSTOMER_H_
#define SRC_CUSTUMER_H_
#include <iostream>
using namespace std;

class Account;
// Customer Details
class Customer{
    string name;
    int id;
    string account_type;
    string address;
    string branch;
    double balance;
    Account* account;

public:
    //=====Name=====
    void setName(string name){
        this->name = name;
    }

    string getName() const {
        return name;
    }

    //=====ID=====
    void setId(int id){
        this->id = id;
    }

    int getId() const {
        return id;
    }

    ////=====Account Type=====
    void setAccountType(string account_type){
       this-> account_type = account_type;
    }

    string getAccountType() const {
        return account_type;
    }

    //=====Address=====
    void setAddress(string address){
        this->address = address;
    }

    string gerAddress() const {
        return address;
    }

    //=====Branch Name=====
    void setBranch(string branch){
        this->branch = branch;
    }

    string getBranch() const {
        return branch;
    }

    //======Balance
    void setBalance(double balance){
        this->balance = balance;
    }

    double getBalance() const {
        return balance;
    }

    Account& getAccount();
};

#endif /* SRC_CUSTUMER_H_ */