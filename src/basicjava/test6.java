package basicjava;
//java Program to check if array of numbers contains only odd numbers; [1,4,6,8] -> false, [5,7,11,9] -> true

public class test6 {
    public static void main(String[] args) {
        String str = "22222";
        char[] charArrayOfString = breakStringToCharArray(str);
        System.out.println(numberChecker(charArrayOfString));
    }
    public static boolean numberChecker (char[] charArrayOfString) {
        for (int pos = 0; pos < charArrayOfString.length; pos++) {
                if (charArrayOfString[pos]%2==0) {
                return false;
                }
        }
        return true;
    }

    public static char[] breakStringToCharArray(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }
}
