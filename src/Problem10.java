/**
 * Created by J-moneyham on 2/21/17.
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 */
public class Problem10 {
    public static void main(String[] args) {

        long sum = 0;
        int numPrimes = 0;

        for (int i = 0; i < 2000000; i++) {
            if (PrimeNumber.isPrime(i)) {
                sum += i;
                //System.out.println("p: " + i + "\tsum: " + sum);
                numPrimes++;
            }
        }

        System.out.println("sum of all primes below 2m: " + sum);
        System.out.println("Number of total primes: " + numPrimes);

        // I got 142913828922, but its VERY inefficient... about 7 minutes run time
        // I refuse to submit an answer until I can get a run-time under 5 minutes
        // new result 142913828922 after updating PrimeNumber.isPrime == same result
        // thanks to help from here:
        // http://stackoverflow.com/questions/2385909/what-would-be-the-fastest-method-to-test-for-primality-in-java

    }
}
