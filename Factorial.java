import java.util.*;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fact(n);
        int n1 = factR(n);
        System.out.println(n1);
    }

    public static void fact(int n) {
        // using iteration
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println(fact);
    }

    public static int factR(int n) {
        // using recursion
        if (n == 0) {
            return 1;
        }

        return n * factR(n - 1);
    }
}
