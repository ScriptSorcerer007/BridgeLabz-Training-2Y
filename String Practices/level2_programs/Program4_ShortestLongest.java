
import java.util.*;

public class Program4_ShortestLongest {
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
    public static int[] findMinMax(String[][] arr) {
        int minIndex = 0, maxIndex = 0;
        for (int i = 1; i < arr.length; i++) {
            if (Integer.parseInt(arr[i][1]) < Integer.parseInt(arr[minIndex][1])) minIndex = i;
            if (Integer.parseInt(arr[i][1]) > Integer.parseInt(arr[maxIndex][1])) maxIndex = i;
        }
        return new int[]{minIndex, maxIndex};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = customSplit(s);
        String[][] arr = wordsWithLength(words);
        int[] res = findMinMax(arr);
        System.out.println("Shortest: " + arr[res[0]][0]);
        System.out.println("Longest: " + arr[res[1]][0]);
    }
}
