package basicjava;
//running alphabert in reverse order using method and for loop

public class test4 {

    public static void main(String[] args) {
        change();

        }


    public static void change(){
        String str = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        char[] charArray = str.toCharArray();
        for(int position = charArray.length - 1; position >= 0; position--){
            System.out.print(charArray[position]);
        }
        }

}
