package basicjava;

import java.io.*;
import java.util.*;

public class Test9 {

    static double cokePri = 0.90;
    static int cokeQty = 20;
    static double fantaPri = 0.85;
    static int fantaQty = 20;
    static double coffeePri = 1.20;
    static int coffeeQty = 20;

    public static void main(String[] args) {
        do {
            int mainChoice = mainMenu();
            if (mainChoice == 1) {
                drinksQtyCalculation();
            }else if (mainChoice == 2) {
                drinkPriceCalculation();
            } else if (mainChoice == 3) {
                System.out.println("Thank You!");
                break;
            }
        } while (true);
    }
    public static int mainMenu() {
        Scanner in = new Scanner(System.in);
        System.out.println("Whaaatclub's Can Drink Machine");
        System.out.println("1)View Drink Catalog");
        System.out.println("2)Apply Price Change For Drink's");
        System.out.println("3)Exit");
        System.out.println("Enter Choice: ");
        return in.nextInt();
    }

    public static int subMenuOpt1(){
        Scanner in = new Scanner(System.in);
        System.out.println("Choose Your Drink");
        System.out.println("1)Coke " + '$' + String.format("%.2f",cokePri) + " " + "x " + cokeQty + "pc");
        System.out.println("2)Fanta Orange " + '$' + String.format("%.2f",fantaPri) + " " + "x " + fantaQty + "pc");
        System.out.println("3)Ice Coffee " + '$' + String.format("%.2f",coffeePri) + " " + "x " + coffeeQty + "pc");
        System.out.println("4)Return to Main Menu");
        System.out.println("Enter Choice: ");
        return in.nextInt();
    }

    public static void drinksQtyCalculation(){
        Scanner in = new Scanner(System.in);
        int subChoiceOpt1 = subMenuOpt1();
            if (subChoiceOpt1==1){
                System.out.println("How many coke do you want?");
                int cokeNum= in.nextInt();
                cokeQty = cokeQty - cokeNum;
                double cokeTotalCost = cokeNum*cokePri;
                System.out.println("Total cost of " + cokeNum + " coke:" + "$" + String.format("%.2f",cokeTotalCost));
                drinksQtyCalculation();
           } else if (subChoiceOpt1==2) {
                System.out.println("How many Fanta Orange do you want?");
                int fantaNum = in.nextInt();
                fantaQty = fantaQty - fantaNum;
                double cokeTotalCost = fantaNum * fantaPri;
                System.out.println("Total cost of " + fantaNum + " Fanta Orange:" + "$" + String.format("%.2f", cokeTotalCost));
                drinksQtyCalculation();
            } else if (subChoiceOpt1==3) {
                System.out.println("How many Ice Coffee do you want?");
                int coffeeNum = in.nextInt();
                coffeeQty = coffeeQty - coffeeNum;
                double cokeTotalCost = coffeeNum * coffeePri;
                System.out.println("Total cost of " + coffeeNum + " Ice Coffee:" + "$" + String.format("%.2f", cokeTotalCost));
                drinksQtyCalculation();
            }
    }
    public static void drinkPriceCalculation() {
        Scanner in = new Scanner(System.in);
        int subChoiceOpt2 = subMenuOpt2();
        if (subChoiceOpt2 == 1) {
            System.out.println("Enter Discount to be change in %");
             int discount = in.nextInt();
            if (discount > 0) {
                cokePri = cokePri + (cokePri * discount / 100);
                fantaPri = fantaPri + (fantaPri * discount / 100);
                coffeePri = coffeePri + (coffeePri * discount / 100);
                System.out.println(cokePri);
                System.out.println(fantaPri);
                System.out.println(coffeePri);
                subMenuOpt2();

            } else {
               cokePri = cokePri + (cokePri * discount / 100);
               fantaPri = fantaPri + (fantaPri * discount / 100);
               coffeePri = coffeePri + (coffeePri * discount / 100);
                System.out.println(cokePri);
                System.out.println(fantaPri);
                System.out.println(coffeePri);
                subMenuOpt2();
            }
        }
        else if (subChoiceOpt2 == 3) {
            mainMenu();
        }
    }
        public static int subMenuOpt2() {
            Scanner in = new Scanner(System.in);
            System.out.println("1) Enter price change in (%)");
            System.out.println("2) Print all price change that is been applied");
            System.out.println("3) Back to Main Manu");
            System.out.println("Enter Choice:");
            return in.nextInt();
        }
    }


