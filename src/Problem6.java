/**
 * Created by J-moneyham on 10/26/16.
 *
 * The sum of the squares of the first ten natural numbers is,

 1^2 + 2^2 + ... + 10^2 = 385
 The square of the sum of the first ten natural numbers is,

 (1 + 2 + ... + 10)^2 = 55^2 = 3025
 Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.

 Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */
public class Problem6 {
    public static void main(String[] args) {
        double sumOfSquares = 0;
        double sumOfNaturals = 0;

        // sum of squares
        for (int i = 1; i <= 100; i++) {
            sumOfSquares += Math.pow(i,2);
        }

        // sum of Naturals
        for (int i = 1; i <= 100; i++) {
            sumOfNaturals += i;
        }

        sumOfNaturals = Math.pow(sumOfNaturals, 2);
        int result = (int) sumOfNaturals - (int) sumOfSquares;

        System.out.println("Answer: " + result);


    }
}
