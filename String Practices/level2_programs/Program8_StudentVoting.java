
import java.util.*;

public class Program8_StudentVoting {
    public static int[] generateAges(int n) {
        int[] ages = new int[n];
        Random r = new Random();
        for (int i = 0; i < n; i++) ages[i] = r.nextInt(90);
        return ages;
    }
    public static String[][] canVote(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) res[i][1] = "false";
            else res[i][1] = (ages[i] >= 18 ? "true" : "false");
        }
        return res;
    }
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] res = canVote(ages);
        System.out.println("Age\tCanVote");
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i][0] + "\t" + res[i][1]);
        }
    }
}
