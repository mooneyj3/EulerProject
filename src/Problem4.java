import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by J-moneyham on 10/26/16.
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.

 Find the largest palindrome made from the product of two 3-digit numbers.
 */
public class Problem4 {
    public static void main(String[] args) {
        // range of work will be between 100^2 and 999^2
        // so 10,000 and 998,001
        // need to have a isPalindrome method
        System.out.println("Answer: " + findNumber());
    }

    public static int findNumber () {
        for (int i = 998001; i > 10000; i--) {
            if (isPalindrome(i)) {
                for (int j = 999; j >= 100; j--) {
                    if (i % j == 0 && i / j <= 999) {
                        System.out.println(i / j);
                        return i;
                    }
                }
            }
        }

        return 0;
    }

    public static boolean isPalindrome (int num) {
        String number = Integer.toString(num);
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
