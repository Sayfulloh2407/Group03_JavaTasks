package week_03;

public class melike {
    public static void main(String[] args) {

        System.out.println(primeNumber(34));
        System.out.println(primeNumber(2));
        System.out.println(primeNumber(37));
        System.out.println(primeNumber(191));
        System.out.println(primeNumber(8));
        System.out.println(primeNumber(9));
        System.out.println(primeNumber(1));
        System.out.println(primeNumber(-35));
        System.out.println("-----------------------------------------");

        System.out.println(reverseNegativeNumber(-2));
        System.out.println(reverseNegativeNumber(-23));
        System.out.println(reverseNegativeNumber(-135));
        System.out.println(reverseNegativeNumber(29));

    }


    private static boolean primeNumber(int i) {
        if (i <= 1) {
            return false;
        }
        boolean result = true;
        for (int j = 2; j < i; j++) {
            if (i % j == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    private static int reverseNegativeNumber(int num) {
        if (num > 0) {
            System.err.println("Please enter negative number");
            System.exit(1);
        }

        int positiveNum = Math.abs(num);

        int reserveNum = 0;
        while (positiveNum > 0) {
            int digit = positiveNum % 10;
            reserveNum = reserveNum * 10 + digit;
            positiveNum /= 10;
        }
        return reserveNum *= -1;

    }
}
