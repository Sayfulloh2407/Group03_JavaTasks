package week_02;
import java.util.Scanner;

public class Aygül {

    public static void main(String[] args) {

        //Question1 Swap two variable values without using a third variable

        int a = 5;
        int b = 10;

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("--------------------------------------------");






        //Question 2 Numbers -- Divisible by 3,5,15
        String divisibleBy15 ="";
        String divisibleBy5 = "";
        String divisibleBy3 = "";

        for (int i = 1; i <= 100 ; i++) {

            if (i%15 == 0) {
                divisibleBy15 += " " + i;
            }
            if (i%5 == 0 && i%15 != 0) {
                divisibleBy5 += " " + i;
            }
            if (i%3 == 0 && i%15 != 0){
                divisibleBy3 += " " + i;
            }


        }

        System.out.println("Divisible by 15:"+divisibleBy15);
        System.out.println("Divisible by 5:"+divisibleBy5);
        System.out.println("Divisible by 3:"+divisibleBy3);


        System.out.println("-------------------------------------------------");


        //Question 3 Numbers -- Print Consecutive numbers

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a positive number: ");
        int num1 = input.nextInt();

        input.close();



        for (int i = 1; i < num1; i++) {
            String result = "";
            if (i%2 ==0 ) {
                result += "Codility";
            }
            if (i%3 == 0  ) {
                result += "Test";
            }
            if (i%5 == 0 ) {
                result+= "Coder";
            }
            if (i%2!= 0 && i%3!=0 && i%5!=0){
                result += i;
            }
            System.out.println(result);
        }

    }

}
