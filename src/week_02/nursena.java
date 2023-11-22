package week_02;

public class nursena {

    public static void main(String[] args) {


        divisibleBy15(100);
        System.out.println("------------------------------------------------------------");
        consecutiveNumber(24);
        System.out.println("------------------------------------------------------------");
        System.out.println(swapNumber(53));
        System.out.println(swapNumber(89));


    }
    public static int swapNumber(int n){
        int result=0;
        //find the ones than change ones to tens
        result+= (n%10) *10;
        //find the tens than change tens to ones
        result+= (n/10);

        return result;
    }
    public static void consecutiveNumber(int n) {

        for (int i = 0; i <= n; i++) {
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
    public static void divisibleBy15(int n) {

        String by15 = "Divisible By 15 ";
        String by5 = "Divisible By 5 ";
        String by3 = "Divisible By 3 ";

        for (int i = 1; i <= n; i++) {
            if (i % 15 == 0) {
                by15 += i + " ";
            }
            if (i % 5 == 0 && i % 15 != 0) { // we don't want to divisible 15 so use && operator
                by5 += i + " ";
            }
            if (i % 3 == 0 && i % 15 != 0) {
                by3 += i + " ";
            }


        }
        System.out.println(by15);
        System.out.println(by5);
        System.out.println(by3);
    }

}

