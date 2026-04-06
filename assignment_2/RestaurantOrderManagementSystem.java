package com.assignment_2;


import java.util.Scanner;

class RestaurantOrderManagementSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Add Menu : ");
        System.out.println("1. palak Paneer : 250");
        System.out.println("2. Kaju Paneer : 350");
        System.out.println("3. Paneer Makhani : 335");
        System.out.println("4. Paneer Butter Masala : 300");
        System.out.println("5. Kaju Masala : 225");
        System.out.println("6. Veg Kolhapuri : 290");
        System.out.println("7. Veg Patiyala : 280");

        System.out.println("Enter no of items");
        int items = sc.nextInt();

        String menu[] = new String[items];
        int price[] = new int[items];

        for (int i = 0; i < items; i++) {
            System.out.println("Enter item : ");
            int item = sc.nextInt();

            switch (item) {
                case 1:
                    menu[i] = "Palak Paneer";
                    price[i] = 250;
                    break;

                case 2:
                    menu[i] = "Kaju Paneer";
                    price[i] = 350;
                    break;

                case 3:
                    menu[i] = "Paneer Makhani ";
                    price[i] = 335;
                    break;

                case 4:
                    menu[i] = "Paneer Butter Masala";
                    price[i] = 300;
                    break;

                case 5:
                    menu[i] = " Kaju Masala";
                    price[i] = 225;
                    break;

                case 6:
                    menu[i] = "Veg Kolhapuri";
                    price[i] = 290;
                    break;

                case 7:
                    menu[i] = "Veg Patiyala";
                    price[i] = 280;
                    break;

                default:
                    System.out.println("Invalid Choice");
                    throw new AssertionError();
            }
        }

        int total = 0;
        for (int i = 0; i < items; i++) {
            total += price[i];
        }

        double GST = total + total * 5 / 100;

        System.out.println("------------------------------");
        System.out.println("Your Orders : ");
        System.out.println("------------------------------");

        for (int i = 0; i < items; i++) {
            System.out.println(menu[i] + "  :  " + price[i]);
        }
        System.out.println("------------------------------");

        System.out.println("Total Amount : " + total);
        System.out.println("+ 5% GST : " + GST);
        System.out.println("------------------------------");

        System.out.println("");

    }
}

