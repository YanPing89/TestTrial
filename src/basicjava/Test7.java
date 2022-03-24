package basicjava;
//Java Program to remove white space from a String -> "I am a good boy" -> "Iamagoodboy", Character.isWhiteSpace(c);

public class Test7 {
    public static void main(String[] args) {
        String str = "Do you know what is the time now? ? ";
        char[] charArrayOfString = breakStringToCharArray(str);
        str = str.replaceAll(" ","");
        System.out.println(str);
        nameChecker(charArrayOfString);
    }
    public static int nameChecker (char[] charArrayOfString) {
        int spaceCount = 0;
        for (int pos = 0; pos < charArrayOfString.length; pos++) {
            if (Character.isWhitespace(charArrayOfString[pos])) // true is whitespace
            {
                spaceCount++;
            }
        }
        System.out.println(spaceCount);
        return spaceCount;
    }
    public static char[] breakStringToCharArray(String str) {
        char[] charArray = str.toCharArray();
        return charArray;
    }

}
