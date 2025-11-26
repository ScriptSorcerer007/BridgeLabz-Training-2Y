import java.util.*;
public class Voting {
  public static void main(String[] args){
    Map<String,Integer> votes = new HashMap<>();
    String[] ballots = {"Alice","Bob","Alice","Carol","Bob","Alice","Bob","Bob","Carol","Alice"};
    for(String b: ballots) votes.put(b, votes.getOrDefault(b,0)+1);
    String winner=null; int max=0;
    for(Map.Entry<String,Integer> e: votes.entrySet()){
      System.out.println(e.getKey()+":"+e.getValue());
      if(e.getValue()>max){max=e.getValue(); winner=e.getKey();}
    }
    System.out.println("Winner:"+winner);
  }
}