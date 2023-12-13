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
        System.out.println("............................................");
    }
    public static void divison(int n){
        String div3 = "", div5 = "", div15 = "";
        for (int i = 1; i <= 100; i++) {
            if ( i % 15 == 0 && i % 5 == 0 && i % 3 ==0) {
                div15 +=i + " " ;
            }
            if (i % 3 == 0 && i % 15 != 0) {
                div3 += i +" " ;
            }
            if (i % 5 == 0 && i % 15 !=0 ) {
                div5 += i + " " ;
            }
            System.out.println(div3 + " is divisible by 3.");
            System.out.println(div5 + " is divisible by 5.");
            System.out.println(div15 + " is divisible by 15.");


        }
        System.out.println("..................................................................");



    }
    public static  void printConsecutiveNumbers(int n){
        for (int i = 1; i <= n; i++) {
            String result = "";
            if (i % 2 == 0) {
                result += "Codility";
            }
            if (i % 3 == 0) {
                result += "Test";
            }
            if (i % 5 == 0) {
                result += "Coders";
            }
            if (i % 2 != 0 && i % 3 != 0 && i % 5 != 0) {
                result += i;
            }
            System.out.println(result);


        }
    }
}