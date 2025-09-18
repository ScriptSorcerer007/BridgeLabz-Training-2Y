
import java.util.*;

public class Program3_SplitWordsLength {
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
    public static String[][] wordsWithLength(String[] words) {
        String[][] arr = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            arr[i][0] = words[i];
            arr[i][1] = String.valueOf(customLength(words[i]));
        }
        return arr;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = customSplit(s);
        String[][] res = wordsWithLength(words);
        System.out.println("Word\tLength");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "\t" + Integer.parseInt(res[i][1]));
        }
    }
}
