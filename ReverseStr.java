import java.util.*;

public class ReverseStr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        System.out.println(len);
        // for (int i = len - 1; i >= 0; i--) {

        // System.out.println(str.charAt(i));
        // }
        revItr(str, len);
        revRec(str, len);
        System.out.println(revRec(str, len));
    }

    public static void revItr(String str, int len) {
        String newStr = "";
        for (int i = len - 1; i >= 0; i--) {
            newStr = newStr + str.charAt(i);
        }
        System.out.println(newStr);
    }

    // usng recursion
    public static String revRec(String str, int len) {
        if (str.isEmpty())
            return str;
        String rev = "";
        rev = str.charAt(0) + rev;

        return revRec(str.substring(1), len - 1) + rev;

    }
}
