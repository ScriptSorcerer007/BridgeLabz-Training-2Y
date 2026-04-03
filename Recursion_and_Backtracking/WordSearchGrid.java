import java.util.*;

public class WordSearchGrid {
    static int n, m;
    static char[][] g;
    static boolean[][] vis;
    static String w;

    static boolean dfs(int i, int j, int k) {
        if (k == w.length()) return true;
        if (i < 0 || j < 0 || i >= n || j >= m) return false;
        if (vis[i][j] || g[i][j] != w.charAt(k)) return false;
        vis[i][j] = true;
        boolean f = dfs(i+1,j,k+1) || dfs(i-1,j,k+1) || dfs(i,j+1,k+1) || dfs(i,j-1,k+1);
        vis[i][j] = false;
        return f;
    }

    static boolean find() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (dfs(i, j, 0)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        g = new char[n][m];
        vis = new boolean[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                g[i][j] = sc.next().charAt(0);
            }
        }
        w = sc.next();
        System.out.println(find());
    }
}
