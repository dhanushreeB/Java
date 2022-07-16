
import java.util.*;

public class FibItrRec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n1 = 0;
        int n2 = 1;
        fibitr(n1, n2, n);
        System.out.println("using recursion");
        System.out.println(n1);
        System.out.println(n2);
        fibrec(n1, n2, n - 2);
    }

    public static void fibitr(int x, int y, int n) {
        int z;
        System.out.println(x);
        System.out.println(y);

        for (int i = 0; i < n - 2; i++) {
            z = x + y;

            System.out.println(z);

            x = y;
            y = z;
        }

    }

    public static void fibrec(int x, int y, int n) {
        int z = 0;
        if (n > 0) {
            z = x + y;
            x = y;
            y = z;
            System.out.println(z);
            fibrec(x, y, n - 1);
        }
    }

    // static void printFibonacci(int count) {
    // if (count > 0) {
    // n3 = n1 + n2;
    // n1 = n2;
    // n2 = n3;
    // System.out.print(" " + n3);
    // printFibonacci(count - 1);
    // }
    // }
}