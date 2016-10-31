/**
 * Created by J-moneyham on 10/28/16.
 */
public class PrimeNumber {



    // static counter
    private static int numberOfPrimes = 0;


    public static boolean isPrime (int num) {
        boolean isPrime = findIsPrime(num);
        if (isPrime == true) numberOfPrimes++;
        return isPrime;
    }

    private static boolean findIsPrime(int num) {
        if (num <= 1) return false;
        if (num == 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int getNumberOfPrimes() {
        return numberOfPrimes;
    }

    public static void resetNumberOfPrimes() {
        numberOfPrimes = 0;
    }



}
