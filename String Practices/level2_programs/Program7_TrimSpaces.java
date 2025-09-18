
import java.util.*;

public class Program7_TrimSpaces {
    public static int[] trimIndexes(String s) {
        int start = 0, end = s.length() - 1;
        while (start < s.length() && s.charAt(start) == ' ') start++;
        while (end >= 0 && s.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }
    public static String substringCustom(String s, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++) res += s.charAt(i);
        return res;
    }
    public static boolean compareCustom(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++) if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] idx = trimIndexes(s);
        String trimmed = substringCustom(s, idx[0], idx[1]);
        System.out.println("Custom: '" + trimmed + "'");
        System.out.println("Built-in: '" + s.trim() + "'");
        System.out.println("Equal? " + compareCustom(trimmed, s.trim()));
    }
}
