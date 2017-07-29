package recursion;


import java.io.IOException;
import java.util.Scanner;

import static java.lang.System.*;

/**
 * Created by Ramesh on 1/15/2017.
 */

public class Fibonacci {

    public static void main(String[] args) throws NumberFormatException, IOException {

        out.println("Enter last number");
        Scanner sc = new Scanner(in);
        int n = sc.nextInt();
        sc.close();

        Fibonacci ob = new Fibonacci();
        out.println("fibonacci series is as follows");
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = ob.fib(i);
            out.println(" " + res);
        }
        out.println();
        out.println(n + "th value of the series is " + res);

    }

    private int fib(int n) {
        if (n == 1) {
            return 1;
        } else if (n == 2) {
            return 1;
        } else {
            return (fib(n - 1) + fib(n - 2));
        }
    }

}