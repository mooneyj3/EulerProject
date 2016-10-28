

/**
 * Created by J-moneyham on 10/26/16.
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 * What is the largest prime factor of the number 600851475143 ?
 *                          600,851,475,143
 * max int size:              2,147,483,647
 *         long:  9,223,372,036,854,775,807
 */
public class Problem3 {
    public static void main(String[] args) {

        long x = 600851475143L;
        int n = 0;

        while (x > 2147483647) {
            for (long i = 1; i < 1000; i++) {
                if (x % i == 0) {
                    x = x / i;
                }
            }
        }
        n = (int) x;

        int value = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                value = i;
            }
        }


        System.out.println("Answer: " + value);
    }

}
