package recursion;

import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Ramesh on 1/15/2017.
 */


class Factorial {

    public static void main(String[] args) {

        out.println("Enter the number");
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();
        Factorial f = new Factorial();
        out.println(f.fact(n));
    }

    private int fact(int n) {
        if (n == 1) {
            return 1;
        }

        return n * fact(n - 1);
    }
}
