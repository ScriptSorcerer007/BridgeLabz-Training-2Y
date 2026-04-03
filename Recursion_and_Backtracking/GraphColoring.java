import java.util.*;

public class GraphColoring {
    static int v, e, c;
    static int[][] g;
    static int[] col;

    static boolean ok(int node, int color) {
        for (int i = 0; i < v; i++) {
            if (g[node][i] == 1 && col[i] == color) return false;
        }
        return true;
    }

    static boolean solve(int node) {
        if (node == v) return true;
        for (int i = 1; i <= c; i++) {
            if (ok(node, i)) {
                col[node] = i;
                if (solve(node + 1)) return true;
                col[node] = 0;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        v = sc.nextInt();
        e = sc.nextInt();
        c = sc.nextInt();
        g = new int[v][v];
        col = new int[v];
        for (int i = 0; i < e; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            g[a][b] = 1;
            g[b][a] = 1;
        }
        if (solve(0)) {
            for (int i = 0; i < v; i++) {
                System.out.print(col[i] + " ");
            }
        } else {
            System.out.println("No Solution");
        }
    }
}
