/**
 * Created by J-moneyham on 10/28/16.
 */
public class PrimeNumber {



    // static counter
    private static int numberOfPrimes = 0;

    public static boolean isPrime (int num) {
        // write method to get identify a prime number
        // count number of true prime numbers
        if (num == 2) {
            numberOfPrimes++;
            return true;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        numberOfPrimes++;
        return true;
    }

    public static int getNumberOfPrimes() {
        return numberOfPrimes;
    }

    public static void resetNumberOfPrimes() {
        numberOfPrimes = 0;
    }



}
