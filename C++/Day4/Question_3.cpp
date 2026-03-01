#include <iostream>
#include <string>
using namespace std;

class TollBooth
{
    //--------Data Members---------
    int totalVehicles = 0;
    double totalRevenue = 0;

public:
    //-----------member functions---------
    void reset()
    {   totalVehicles = 0;
        totalRevenue = 0;
        cout<<"Total Vehicles : " <<totalVehicles<<endl;
        cout<<"Total Revenue : " <<totalRevenue<<endl;
    }

    void vehiclePayingToll(int vehicleType, double tollAmount)
    {
        this->totalVehicles += 1;
        this->totalRevenue += tollAmount;

        cout << "Total Vehicles : " << this->totalVehicles << endl;
        cout << "Total Revenue : " << this->totalRevenue << "\n" <<endl;
    }

    int getTotalVehicles() const
    {
        return this->totalVehicles;
    }

    double getTotalRevenue() const
    {
        return this->totalRevenue;
    }
};

int main()
{
    TollBooth tb;
    const int car = 1;
    const int bus = 2;
    const int truck = 3;

    const double carAmount = 180;
    const double busAmount = 300;
    const double truckAmount = 350;

    int choice;

    do
    {
        cout << "Press 1: Add a standard car and collect toll." << endl;
        cout << "Press 2: Add a standard bus and collect toll." << endl;
        cout << "Press 3: Add a standard truck and collect toll." << endl;
        cout << "Press 4: Display Total Vehicles Passed." << endl;
        cout << "Press 5: Display Total Revenue Collected." << endl;
        cout << "Press 6: Reset Booth statistics." << endl;
        cout << "Press 7: Exit!.\n" << endl;

        cin >> choice;

        switch (choice)
        {
        case 1:
            tb.vehiclePayingToll(car, carAmount);
            break;

        case 2:
            tb.vehiclePayingToll(bus, busAmount);
            break;

        case 3:
            tb.vehiclePayingToll(truck, truckAmount);
            break;

        case 4:
            cout << "Total Vehicles Passed : " << tb.getTotalVehicles() << endl;
            break;

        case 5:
            cout << "Total Revenue Collected : " << tb.getTotalRevenue() << endl;
            break;

        case 6:
            tb.reset();
            break;

        case 7:
            "EXIT!";
            break;

        default:
            cout << "Invalid Choice\n";
            break;
        }

    } while (choice != 7);
}