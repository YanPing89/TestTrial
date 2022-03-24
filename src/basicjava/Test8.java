package basicjava;
// program to calculate income tax and define low or high income salary

import java.io.*;
import java.util.*;

public class Test8 {

    public static void main(String[] args) {
        do {
            int d = startMenu();
            if (d == 1) {
                salaryLevel();
            } else if (d == 2) {
                incomeTax();
            } else if (d == 3) {
                System.out.println("Thank You!");
                break;
            }
        } while (true);
    }

    public static int startMenu() {
        Scanner in = new Scanner(System.in);
        String welcome = "Welcome to Salary Calculator";
        String opt1 = "1)Check Salary level";
        String opt2 = "2)Check income tax";
        String opt3 = "3)Exit";
        String opt4 = ("Enter Choice: ");
        System.out.println(welcome);
        System.out.println(opt1);
        System.out.println(opt2);
        System.out.println(opt3);
        System.out.println(opt4);
        return in.nextInt();
    }

    public static void salaryLevel() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Monthly Salary:");
        int a;
        a = in.nextInt();
        if (a < 1000) {
            System.out.println("Low Income Class");
        } else if ((a >= 1000) && (a < 2000)) {
            System.out.println("Average Income");
        } else if (a >= 2000 && (a < 4000)&&(a!=3333)) {
            System.out.println("Mid Class Income");
        } else if (a >= 4000) {
            System.out.println("High Income");
        } else if (a == 3333) {
            System.out.println("1234");
        }
    }
        public static void incomeTax () {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter Monthly Salary:");
            int a;
            a = in.nextInt();
            double result = (a * (20 / 100.0)) * 12;
            System.out.println("yearly income tax: " + result);
        }


    }



