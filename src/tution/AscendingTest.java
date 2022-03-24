package tution;

import java.util.ArrayList;
import java.util.List;

public class AscendingTest {

    public static void main(String[] args) {
        List<Integer> originalList = new ArrayList<>(List.of(new Integer[]{444, 16, 71, 0,  55, 20000, -560, -60, 1025, 1}));

        Integer smallestNumber = Integer.MAX_VALUE;
        List<Integer> sortedList = new ArrayList();

        for (int sortedAPos = 0; sortedAPos < originalList.size(); sortedAPos ++) {

            // find the SMALLEST number
            for (int b = 0; b < originalList.size(); b++) {
                if (smallestNumber > originalList.get(b)) {
                    smallestNumber = originalList.get(b);
                }
            }
            // assign the SMALLEST number to the sortedList
            sortedList.add(smallestNumber);
            // remove the SMALLEST number to sor
            originalList.remove(smallestNumber);
            sortedAPos --;

            smallestNumber = Integer.MAX_VALUE;
        }

        System.out.println(sortedList);
    }
}
