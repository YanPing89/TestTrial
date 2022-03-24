package basicjava;

public class test5 {

    public static void main(String[] args) {
        String str = "1234567";
        char[] charArrayOfString = breakStringToCharArray(str);
        System.out.println("Vowel Exist: " + checkIfVowelExist(charArrayOfString));
    }
    public static boolean checkIfVowelExist(char[] charArrayOfString){
        char[] vowelArray = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};

        for (int pos = 0; pos < charArrayOfString.length ; pos ++) {
            for (int vowelPos = 0; vowelPos < vowelArray.length; vowelPos ++ ) {
                if ( charArrayOfString[pos] == vowelArray[vowelPos] ) {
                    return true;
                }
            }

        }
        return false;
    }

    public static char[] breakStringToCharArray(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }
}