#include <iostream>
#include <string>
using namespace std;

class Employee
{
    int empId;
    string empName;
    double empSalary;

public:
    //===============EmpName
    void setName(string empName)
    {
        this->empName = empName;
    }

    string getName()
    {
        return empName;
    }

    //==============EmpId
    void setId(int empId)
    {
        this->empId = empId;
    }

    int getId() 
    {
        return empId;
    }

    //================EmpSalary
    void setSalary(double empSalary)
    {
        this->empSalary = empSalary;
    }

    double getSalary()
    {
        return empSalary;
    }

    //===========SalaryCalculator
    double grossSalary(double salary)
    {
        double result;
        if (salary <= 5000)
        {
            result = salary + (salary * 10 / 100);
        }
        else if (salary > 5000 && salary <= 10000)
        {
            result = salary + (salary * 15 / 100);
        }
        else if (salary > 10000)
        {
            result = salary + (salary * 20 / 100);
        }
        return result;
    }

    //===================displayEmployeeDetails
    void displayEmployeeDetails()
    {
        cout << "Name : " << getName() << endl;
        cout << "Id : " << getId() << endl;
        cout << "Gross Salary : " << grossSalary(getSalary()) << endl;
    }

    void updateUserInfo()
    {
        string nm;
        double sal;
        cout << "Enter Your Name : ";
        cin.ignore();
        getline(cin, nm);
        setName(nm);

        cout << "Enter Your salary :";
        cin >> sal;
        setSalary(sal);
    }
};

int main()
{
    int n;
    cout<<"Enter no of employees you want to store."<<endl;
    cin>>n;
    Employee em[n];
    int id;
    string name;
    double salary;

        
    int choice;
    

    do
    {
        
        cout << "Press 1 : Enter Employee Details." << endl;
        cout << "Press 2 : To calculate Gross Salary" << endl;
        cout << "Press 3 : Display the Employee Details" << endl;
        cout << "Press 4 : Update Employee Details." << endl;
        cout << "Press 5 : Exit the Program" << endl;
        
        cin >> choice;
        switch (choice)
        {
        case 1:
            for (int i = 0; i < n; i++)
            {
                cout << "----------Enter Your Details----------" << endl;
                cout<< "------------Employee "<<i + 1<<"-------" << endl;
                cout << "Enter Your Name : ";
                cin.ignore();
                getline(cin, name);
                em[i].setName(name);

                cout << "Enter Your Id : ";
                cin >> id;
                em[i].setId(id);

                cout << "Enter Your Salary : ";
                cin >> salary;
                em[i].setSalary(salary);
                
            }
            break;

        case 2:
            for (int i = 0; i < n; i++)
            {
                cout<<"------------Employee Details------------"<<endl;
                cout<<em[i].grossSalary(em[i].getSalary())<<endl;
            }
            break;

        case 3:
            for (int i = 0; i < n; i++)
            {
                em[i].displayEmployeeDetails();
            }
            break;

        case 4:
            for (int i = 0; i < n; i++)
            {
                em[i].updateUserInfo();
                em[i].displayEmployeeDetails();

            }
            break;

        case 5:
            cout<<"EXIT!";
            break;

        default: 
            break;
        }
    } while (choice != 4);
}