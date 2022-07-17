import java.util.*;
import java.lang.Math;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        isArmStrongI(n);
    }

    public static void isArmStrongI(int n) {
        int temp = n;
        int r = 0;
        while (temp > 0) {

            r += Math.pow(temp % 10, 3);
            temp = temp / 10;
        }

        if (r == n) {
            System.out.println("is an armstrong number");
        } else {
            System.out.println("not an armstrong");
        }
    }
}
