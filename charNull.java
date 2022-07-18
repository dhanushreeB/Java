import java.util.*;

public class charNull {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int len = str.length();
        System.out.println(len);
        countChar(str, len);
    }

    public static void countChar(String s, int len) {
        int countC = 0;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != ' ') {
                countC++;
            }
        }
        System.out.println(countC);
    }
}
// where there is a will there is a way
// 36
// 28