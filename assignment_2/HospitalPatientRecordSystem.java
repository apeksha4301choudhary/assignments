package com.assignment_2;

import java.util.Scanner;

class HospitalPatientRecordSystem{
    int patientID;
    String patientName;
    int age;
    String disease;

    public HospitalPatientRecordSystem( int patientID, String patientName, int age, String disease) {
        this.patientID = patientID;
        this.patientName = patientName;
        this.age = age;
        this.disease = disease;
    }

    public void isSeniorCitizen(){
        if(this.age >= 60){
            System.out.println("Sinior Citizen");
        }
    }

    public void displayDetails(){
        System.out.println("Patient ID : " + this.patientID + 
        "\nPatient Name : " + this.patientName + 
        "\nAge : " + this.age + 
        "\nDisease : " + this.disease
        );
        isSeniorCitizen();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalPatientRecordSystem hp[] = new HospitalPatientRecordSystem[3];

        for(int i = 0; i < 3 ; i++){
        	System.out.println();
        	System.out.println("Patient " + (i+1) + "---------");
            System.out.print("Enter Patient ID : ");
            int id = sc.nextInt();

            System.out.println("Enter Patient Name : ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.println("Patient age : ");
            int age = sc.nextInt();

            System.out.println("Patient Disease : ");
            sc.nextLine();
            String disease = sc.nextLine();

            hp[i] = new HospitalPatientRecordSystem(id, name, age, disease);
        }
        
        for(int i = 0; i < 3 ; i++) {
        	System.out.println();
        	System.out.println("-------------Patient Details------------");
        	hp[i].displayDetails();
        	System.out.println("-------------Patient Details------------");
        }
    }
}