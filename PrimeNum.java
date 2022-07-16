import java.util.*;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isPrime(n);

    }

    public static void isPrime(int n) {
        int flag = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                flag = 1;
                System.out.println("the number is not prime");
                break;
            }

        }
        if (flag == 0) {
            System.out.println("the number is prime number");
        }

    }
}
