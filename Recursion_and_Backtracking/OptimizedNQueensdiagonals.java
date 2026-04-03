import java.util.*;

public class OptimizedNQueensdiagonals {
    static int n;
    static int[] q;
    static boolean[] col, d1, d2;

    static boolean solve(int r){
        if(r==n) return true;
        for(int c=0;c<n;c++){
            if(!col[c] && !d1[r-c+n] && !d2[r+c]){
                q[r]=c;
                col[c]=d1[r-c+n]=d2[r+c]=true;
                if(solve(r+1)) return true;
                col[c]=d1[r-c+n]=d2[r+c]=false;
            }
        }
        return false;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        q=new int[n];
        col=new boolean[n];
        d1=new boolean[2*n];
        d2=new boolean[2*n];

        if(solve(0)){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    if(q[i]==j) System.out.print("Q ");
                    else System.out.print(". ");
                }
                System.out.println();
            }
        }else{
            System.out.println("No Solution");
        }
    }
}
