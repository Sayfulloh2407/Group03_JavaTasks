package week_02;

public class Task1 {
    public static void main(String[] args) {


        int a = 10;
        int b = 5;

        a = a + b;  // a= 15
        b = a - b; // b = new a(15) - b(5)=10
        a = a - b; // a = 15 - 10 = 5

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}