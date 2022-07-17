import java.util.*;

public class NthPrimeNumberExample {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n to compute the nth prime number: ");

        int n = sc.nextInt();
        int num = 1, count = 0, i;
        while (count < n) {
            num = num + 1;
            System.out.println("num values" + num);
            for (i = 2; i <= num; i++) {

                if (num % i == 0) {

                    break;
                }
            }
            if (i == num) {
                // increments the count variable by 1 if the number is prime
                count = count + 1;
                System.out.println("count values" + count);
            }
            // Enter the value of n to compute the nth prime number: 5
            // num values2
            // count values1
            // num values3
            // count values2
            // num values4
            // num values5
            // count values3
            // num values6
            // num values7
            // count values4
            // num values8
            // num values9
            // num values10
            // num values11
            // count values5
            // The 5th prime number is: 11
        }
        // prints the nth prime number
        System.out.print("The " + n + "th prime number is: " + num);
    }
}