package basicjava;

import java.util.*;

//TODO - Create a Car Park System to track number of parking vehicles and available slots
//TODO - Park 10 vehicles and print available slots (1 vehicle take 1 slot)
// Solution using For loop

public class Test2 {
    public static final int SIZE = 50;
    public static void main(String[] args) {
            int a = 50;

        for (int C=0; C<=10; C++){
            int remain = --a;
            System.out.println(remain);
        }

    }
}