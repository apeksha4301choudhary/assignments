#include <iostream>
#include <string>
using namespace std;

class Student
{
    string name;
    int rollno;
    float marks;
    char grade;

public:
    //========name================
    void setName(string name){this->name = name;}
    string getName(){return name;}

    //=========rollno=============
    void setRollno(int rollno){this->rollno = rollno;}
    int getRollno(){return rollno;}

    //==========marks=============
    void setMarks(float marks){this->marks = marks;}
    float getMarks(){return marks;}

    //===========grade===========
    char calculateGrade()
    {
        if (marks >= 90){return 'A';}
        else if (marks >= 80){return 'B';}
        else if (marks >= 70){return 'C';}
        else if (marks >= 60){return 'D';}
        else
            return 'F';
    }

    void display()
    {
        cout << "Name : " << getName() << endl;
        cout << "RollNo : " << getRollno() << endl;
        cout << "Marks : " << getMarks() << endl;
        cout << "Grade : " << calculateGrade() << endl;
    }
};

int main()
{
    Student s;
    string n;
    int rl;
    float mrk;
    int choice;

    do
    {
        cout << "Press 1 : Accept Information" << endl;
        cout << "Press 2 : Display information" << endl;
        cout << "Press 3 : Calculate Grade" << endl;
        cout << "Press 4 : Exit the program." << endl;

        cin >> choice;
        switch (choice)
        {
        case 1:
            cout<<"Enter Name : ";
            cin.ignore();
            getline(cin, n);
            cout<<"Enter Rollno : ";
            cin>>rl;
            cout<<"Enter marks : ";
            cin>>mrk;

            s.setName(n);
            s.setRollno(rl);
            s.setMarks(mrk);
            break;

        case 2:
            s.display();
            break;

        case 3:
            cout << "Grade : " << s.calculateGrade() << endl;
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
