/**
 * Created by J-moneyham on 10/26/16.
 */
public class Problem1 {
    public static void main(String[] args) {

        int sum3or5 = 0;

        for (int i = 0; i < 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum3or5 += i;
            }
        }

        System.out.println("Answer: " + sum3or5);
    }
}
