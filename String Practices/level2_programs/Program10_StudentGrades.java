
import java.util.*;

public class Program10_StudentGrades {
    public static int[][] generateScores(int n) {
        int[][] arr = new int[n][3];
        Random r = new Random();
        for (int i=0;i<n;i++) {
            arr[i][0]=r.nextInt(100);
            arr[i][1]=r.nextInt(100);
            arr[i][2]=r.nextInt(100);
        }
        return arr;
    }
    public static double[][] calcResults(int[][] arr) {
        double[][] res = new double[arr.length][3];
        for (int i=0;i<arr.length;i++) {
            int total = arr[i][0]+arr[i][1]+arr[i][2];
            double avg = total/3.0;
            double per = Math.round((total/3.0)*100.0)/100.0;
            res[i][0]=total; res[i][1]=avg; res[i][2]=per;
        }
        return res;
    }
    public static String[] grades(double[][] res) {
        String[] g = new String[res.length];
        for (int i=0;i<res.length;i++) {
            double p=res[i][2];
            if (p>=90) g[i]="A";
            else if (p>=75) g[i]="B";
            else if (p>=60) g[i]="C";
            else if (p>=40) g[i]="D";
            else g[i]="F";
        }
        return g;
    }
    public static void main(String[] args) {
        int[][] scores=generateScores(5);
        double[][] res=calcResults(scores);
        String[] g=grades(res);
        System.out.println("Phy\tChem\tMath\tTotal\tAvg\tPer\tGrade");
        for (int i=0;i<scores.length;i++) {
            System.out.println(scores[i][0]+"\t"+scores[i][1]+"\t"+scores[i][2]+"\t"+(int)res[i][0]+"\t"+res[i][1]+"\t"+res[i][2]+"\t"+g[i]);
        }
    }
}
