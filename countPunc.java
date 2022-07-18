import java.util.*;

public class countPunc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        System.out.println(len);
        countCharPunc(str, len);
    }

    public static void countCharPunc(String s, int len) {
        int countP = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == '!' || s.charAt(i) == ',' || s.charAt(i) == ';' || s.charAt(i) == '.'
                    || s.charAt(i) == '?' || s.charAt(i) == '-' ||
                    s.charAt(i) == '\'' || s.charAt(i) == '\"' || s.charAt(i) == ':') {
                countP++;
            }
        }
        System.out.println(countP);
    }
}
// where !,;.?-\ is the way
// 24
// 6