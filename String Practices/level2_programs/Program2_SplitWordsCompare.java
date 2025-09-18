
import java.util.*;

public class Program2_SplitWordsCompare {
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static String[] customSplit(String s) {
        int len = customLength(s);
        ArrayList<String> words = new ArrayList<>();
        String temp = "";
        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                if (!temp.equals("")) {
                    words.add(temp);
                    temp = "";
                }
            } else {
                temp += c;
            }
        }
        if (!temp.equals("")) words.add(temp);
        return words.toArray(new String[0]);
    }
    public static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] custom = customSplit(s);
        String[] builtin = s.split(" ");
        System.out.println("Equal? " + compareArrays(custom, builtin));
    }
}
