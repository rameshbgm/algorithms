package recursion;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Created by Ramesh on 1/15/2017.
 */
public class TowersOfHanoi {

    public void solve(int n, String start, String auxiliary, String end) {
        if (n == 1) {
            out.println(start + " -> " + end);
        } else {
            solve(n - 1, start, end, auxiliary);
            out.println(start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }

    public static void main(String[] args) {
        TowersOfHanoi towersOfHanoi = new TowersOfHanoi();
        System.out.print("Enter number of discs: ");
        Scanner scanner = new Scanner(System.in);
        int discs = scanner.nextInt();
        towersOfHanoi.solve(discs, "A", "B", "C");
    }
}
