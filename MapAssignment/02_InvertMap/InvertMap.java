import java.util.*;
public class InvertMap {
  public static void main(String[] args){
    Map<String,Integer> m = new HashMap<>();
    m.put("A",1); m.put("B",2); m.put("C",1);
    Map<Integer,List<String>> inv = new HashMap<>();
    for(Map.Entry<String,Integer> e: m.entrySet()){
      inv.computeIfAbsent(e.getValue(), k-> new ArrayList<>()).add(e.getKey());
    }
    System.out.println(inv);
  }
}