import java.util.*;
public class VisitTracker {
  public static void main(String[] args){
    Map<String,Integer> m = new HashMap<>();
    String[] visits = {"home","about","products","home","products","contact","home"};
    for(String p: visits) m.put(p, m.getOrDefault(p,0)+1);
    List<Map.Entry<String,Integer>> list = new ArrayList<>(m.entrySet());
    list.sort((a,b)->b.getValue()-a.getValue());
    for(Map.Entry<String,Integer> e: list) System.out.println(e.getKey()+":"+e.getValue());
    System.out.println("Top:"+list.get(0).getKey());
  }
}