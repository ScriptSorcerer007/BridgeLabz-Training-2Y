import java.util.*;

public class WordPuzzleBacktracking {
    static int n, m;
    static char[][] g;
    static boolean[][] vis;
    static String w;
    static int[] dx = {-1,-1,-1,0,0,1,1,1};
    static int[] dy = {-1,0,1,-1,1,-1,0,1};

    static boolean go(int i, int j, int k) {
        if (k == w.length()) return true;
        if (i<0||j<0||i>=n||j>=m) return false;
        if (vis[i][j] || g[i][j] != w.charAt(k)) return false;
        vis[i][j] = true;
        for (int d = 0; d < 8; d++) {
            if (go(i+dx[d], j+dy[d], k+1)) return true;
        }
        vis[i][j] = false;
        return false;
    }

    static boolean find() {
        for (int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(go(i,j,0)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        g=new char[n][m];
        vis=new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                g[i][j]=sc.next().charAt(0);
            }
        }
        w=sc.next();
        System.out.println(find());
    }
}
