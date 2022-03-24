package basicjava;

import java.util.*;

//TODO - Create a Car Park System to track number of parking vehicles and available slots
//TODO - Park 10 vehicles and print available slots (1 vehicle take 1 slot)
// Solution using For method & For loop

public class test3 {
    public static final int SIZE = 50;
    static int left = 50;
    public static void main(String[] args) {
        for (int C=0; C<=10; C++){
            park();
        }

    }
    public static void park(){
    --left;
        System.out.println(left);
    }
}