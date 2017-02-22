/**
 * Created by J-moneyham on 2/21/17.
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
 * a^2 + b^2 = c^2
 *
 * For example, 32 + 42 = 9 + 16 = 25 = 52.
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
 * Find the product abc.
 *
 * magic number:  292.893
 * found by assuming a = b in the equation a^2 + b^2 + sqrt(a^2 + b^2) = 1000
 */


public class Problem9 {

    public static void main(String[] args) {
        // going to use my magic number and modulo divisions
        // magic number will be 293

        int a = 292;
        int b = 293;
        int c;
        double cDoub;
        double sum;
        int numSearches = 0;


        // if the sum is less than 1000 increment b
        // if the sum is more than 1000 decrement a
        boolean search = true;
        boolean validC;

        while (search) {
            numSearches++;
            // calculate c
            cDoub = Math.sqrt(a*a + b*b);
            c = (int) cDoub;

            validC = !(cDoub - (double) c > 0);

            sum = cDoub + a + b;

            if (sum > 1000.0) {
                a--;
            }
            else if (sum < 1000.0){
                b++;
            }
            else if (validC) {
                // System.out.println("found something");
                System.out.println("a:\t" + a + "\tb:\t" + b + "\tc:\t" + c);
                //System.out.println("sum of a,b,c = " + sumabc);
                int product = a*b*c;
                System.out.println("product of a,b,c  = " + product );
                System.out.println("number of searches: " + numSearches);
                search = false;
            }

            if (a == 0 || b == 500) {
                search = false;
                System.out.println("Failed to find String!");
            }
        }
    }
}
