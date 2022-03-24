package tution;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DescendingTest {

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(List.of(new Integer[]{444, 16, 71, 0,  55, 20000, -560, -60, 1025, 1}));
        //Collections.sort(originalList,Collections.reverseOrder()); // Code for Sorting Purpose

        Integer largestNumber = Integer.MIN_VALUE;
        List<Integer> sortedList = new ArrayList();
        for (int sortedAPos = 0; sortedAPos < originalList.size(); sortedAPos ++) {

            // find the SMALLEST number
            for (int b = 0; b < originalList.size(); b++) {
                if (largestNumber < originalList.get(b)) {
                    largestNumber = originalList.get(b);
                }
            }
            // assign the SMALLEST number to the sortedList
            sortedList.add(largestNumber);
            // remove the SMALLEST number to sor
            originalList.remove(largestNumber);
            sortedAPos --;

            largestNumber = Integer.MIN_VALUE;
        }
        System.out.println(originalList);
    }
}
