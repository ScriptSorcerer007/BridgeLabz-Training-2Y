
import java.util.*;

public class Program9_RockPaperScissors {
    public static String computerChoice() {
        int n = (int)(Math.random()*3);
        if (n==0) return "rock";
        if (n==1) return "paper";
        return "scissors";
    }
    public static int winner(String user, String comp) {
        if (user.equals(comp)) return 0;
        if ((user.equals("rock") && comp.equals("scissors")) ||
            (user.equals("scissors") && comp.equals("paper")) ||
            (user.equals("paper") && comp.equals("rock"))) return 1;
        return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Games: ");
        int g = sc.nextInt();
        int uw=0, cw=0;
        for (int i=0;i<g;i++) {
            String user = sc.next();
            String comp = computerChoice();
            int res = winner(user, comp);
            if (res==1) uw++; else if (res==-1) cw++;
            System.out.println("You: "+user+" Comp: "+comp+" -> "+(res==0?"Draw":res==1?"User Wins":"Comp Wins"));
        }
        System.out.println("User Wins: "+uw+" Comp Wins: "+cw);
        System.out.println("User %: "+(uw*100.0/g)+" Comp %: "+(cw*100.0/g));
    }
}
