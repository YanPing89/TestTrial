package basicjava;
//Sample of do while loop

public class Test1 {

    static int addNumbers(int a, int b) {
        return a+b;
    }

    public static void main(String[] args) {
        int i = 0;
        do{
            i = i + 1;
            System.out.println(i);
        }while(i != 5);
    }
}
