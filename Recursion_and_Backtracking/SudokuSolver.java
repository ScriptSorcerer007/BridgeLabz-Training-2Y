import java.util.*;

public class SudokuSolver {
    static int[][] g = new int[9][9];

    static boolean solve() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (g[i][j] == 0) {
                    for (int d = 1; d <= 9; d++) {
                        if (ok(i, j, d)) {
                            g[i][j] = d;
                            if (solve()) return true;
                            g[i][j] = 0;
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }

    static boolean ok(int r, int c, int d) {
        for (int i = 0; i < 9; i++) {
            if (g[r][i] == d || g[i][c] == d) return false;
        }
        int sr = (r / 3) * 3;
        int sc = (c / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (g[i][j] == d) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                g[i][j] = sc.nextInt();
            }
        }
        solve();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(g[i][j] + " ");
            }
            System.out.println();
        }
    }
}
