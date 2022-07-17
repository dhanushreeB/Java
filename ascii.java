import java.util.*;

public class ascii {
    public static void main(String[] args) {
        System.out.print("Enter a character: ");
        Scanner sc = new Scanner(System.in);
        char chr = sc.next().charAt(0);
        int ascii = chr;
        System.out.println(ascii);

        System.out.print("Enter a int: ");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.println("ascii value of   " + (char) i + "is  " + i);
        }
    }
}
