package basicjava;

import java.io.*;
import java.util.*;

//This demo is a simple Calculator

public class Main {

    static int add(int a, int b) {
        return a+b;
    }

    static int minus(int a, int b) {
        return a-b;
    }

    static int multiply(int a, int b) {
        return a*b;
    }

    static float divide(float a, float b) {
        return a/b;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        for (int c = 0; c < 1; c++) {

            int a;
            a = in.nextInt();
            int b;
            b = in.nextInt();
            int sum;

            String operator;
            operator = in.next();

            if (operator.equals("+")) {
                int result = add(a, b);
                System.out.println(result);
            } else if (operator.equals("-")) {
                int result = minus(a, b);
                System.out.println(result);
            } else if (operator.equals("*")) {
                int result = multiply(a, b);
                System.out.println(result);
            } else if (operator.equals("/")) {
                float result = divide((float) a, (float) b);
                System.out.println(result);
                System.out.printf("%.2f", result);
            }
        }
    }
}
