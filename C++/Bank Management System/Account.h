
#include <iostream>
#include "Customer.h"
#ifndef SRC_ACCOUNT_H_
#define SRC_ACCOUNT_H_

using namespace std;

// Account Details
class Account {
public:
    void createAccount();
    void viewAccount();
    void checkBalance();
    void depositeMoney();
    void withdrawMoney();
    void updateMoney();
};

#endif /*SRC_ACCOUNT_H_*/