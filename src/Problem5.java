/**
 * Created by J-moneyham on 10/26/16.
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.

 What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
 */
public class Problem5 {
    public static void main(String[] args) {
        boolean isDivis = false;
        int solution = 20;

        while (!isDivis) {

            for (int i = 1; i <= 20; i++) {
                if (solution % i != 0) {
                    solution++;
                    i = 21;
                    isDivis = false;
                } else {
                    isDivis = true;
                }
            }


        }

        System.out.println(solution);

    }
}
