#include <iostream>
#include <string>
using namespace std;

class BankAccount
{
    int account_number;
    string account_holder_name;
    double balance;

public:
    void setAccountNumber(int account_number){this->account_number = account_number;}

    int getAccountNumber()
    {
        return account_number;
    }

    void setAccountHolderName(string account_holder_name)
    {
        this->account_holder_name = account_holder_name;
    }

    string getAccountHolderName()
    {
        return account_holder_name;
    }

    void setBalance(double balance)
    {
        this->balance = balance;
    }

    double getBalance()
    {
        return balance;
    }

    

    double deposite(double deposite_money)
    {
        double total;
        if (deposite_money > 0)
        {
            total = this->balance + deposite_money;
            setBalance(total);
        }
        else
        {
            cout << "Enter Valid Amount!!!";
        }
        return getBalance();
    }

    double withdraw(double withdraw_money)
    {
        double total;
        if (withdraw_money < this->balance)
        {
            total = this->balance - withdraw_money;
            setBalance(total);
        }
        else
        {
            cout << "Insufficient Balance";
        }
        return getBalance();
    }

    void displayData()
    {
        cout << "Name : " << getAccountHolderName()<< endl;
        cout << "Account Number : " << getAccountNumber()<< endl;
        cout << "Total Blance : " << getBalance() << endl;
    }
};

int main()
{
    BankAccount ac;

    string n;
    int num;
    double bal;
        
    int choice;
    double amount;

    cout << "Enter Your Name : ";
    cin.ignore();
    getline(cin, n);
    cout << "Enter Your Account Number : ";
    cin >> num;
    cout << "Enter Your Balance : ";
    cin >> bal;

    ac.setAccountHolderName(n);
    ac.setAccountNumber(num);
    ac.setBalance(bal);

    do
    {
        cout << "Press 1 : Deposite Money To an Existing data." << endl;
        cout << "Press 2 : Withdraw Money From an Existing data" << endl;
        cout << "Press 3 : Display the account Details" << endl;
        cout << "Press 4 : Exit the program." << endl;

        cin >> choice;
        switch (choice)
        {
        case 1:
            cout << "Enter ammount to deposite : " << endl;
            cin >> amount;
            cout<<"Your Current Balance is : "<<ac.deposite(amount)<<endl;
            break;

        case 2:
            cout << "Enter ammount to withraw : " << endl;
            cin >> amount;
            cout<<"Your Current Balance is : "<<ac.withdraw(amount)<<endl;
            break;

        case 3:
            ac.displayData();
            break;

        case 4:
            cout << "Exit" << endl;
            break;

        default:
            cout << "Invalid Choice" << endl;
            break;
        }

    } while (choice != 4);

    return 0;
}