/**
 * Created by J-moneyham on 10/26/16.
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.

 What is the 10 001st prime number?
 */
public class Problem7 {
    public static void main(String[] args) {
        int counter = 0;
        int primes = 0;

        while (primes <= 10001) {
            counter++;
            if (PrimeNumber.isPrime(counter)) {
                primes++;
                //System.out.println(counter);
            }


        }

        System.out.println("Answer: " + counter);
    }






}
