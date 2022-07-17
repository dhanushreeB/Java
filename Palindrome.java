import java.util.*;

import javax.print.DocFlavor.STRING;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        // for (int i = len - 1; i >= 0; i--) {

        // System.out.println(str.charAt(i));
        // }
        isPalinItr(str, len);

    }

    public static void isPalinItr(String str, int len) {
        String reverse = "";
        for (int i = len - 1; i >= 0; i--)
            reverse += str.charAt(i);
        if (str.equals(reverse))
            System.out.println("Entered string/number is a palindrome.");
        else
            System.out.println("Entered string/number isn't a palindrome.");

    }
    // the other way this can be solved by running a forloop n/2 times having 2
    // conditions if n is oddor n is even

}
