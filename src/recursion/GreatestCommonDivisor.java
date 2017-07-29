package recursion;

/**
 * Created by Ramesh on 1/15/2017.
 */
public class GreatestCommonDivisor {
    public static int gcd(int p, int q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }

    public static void main(String[] args) {
        System.out.println(gcd(50, 5) );
    }
}
