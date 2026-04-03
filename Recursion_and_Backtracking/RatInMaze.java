import java.util.*;

public class RatInMaze {
    static int n;
    static int[][] m;
    static int[][] path;

    static boolean go(int i, int j) {
        if (i == n - 1 && j == n - 1 && m[i][j] == 1) {
            path[i][j] = 1;
            return true;
        }
        if (i >= 0 && j >= 0 && i < n && j < n && m[i][j] == 1 && path[i][j] == 0) {
            path[i][j] = 1;
            if (go(i + 1, j)) return true;
            if (go(i, j + 1)) return true;
            if (go(i - 1, j)) return true;
            if (go(i, j - 1)) return true;
            path[i][j] = 0;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = new int[n][n];
        path = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                m[i][j] = sc.nextInt();
            }
        }
        if (go(0, 0)) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No Path");
        }
    }
}
