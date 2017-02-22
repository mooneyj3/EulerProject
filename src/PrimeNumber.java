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
        if (num <= 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;
        long sqrtN = (long)Math.sqrt(num)+1;
        for (long i = 6L; i <= sqrtN; i += 6) {
            if(num%(i-1) == 0 || num%(i+1) == 0) return false;
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
