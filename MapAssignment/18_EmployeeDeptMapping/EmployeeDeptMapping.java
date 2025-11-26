import java.util.*;
public class EmpDept {
  public static void main(String[] args){
    Map<Integer,String> m = new HashMap<>();
    m.put(1,"HR"); m.put(2,"IT"); m.put(3,"IT"); m.put(4,"Sales"); m.put(5,"HR");
    m.put(3,"Sales");
    Map<String,List<Integer>> rev = new HashMap<>();
    for(Map.Entry<Integer,String> e: m.entrySet()) rev.computeIfAbsent(e.getValue(),k->new ArrayList<>()).add(e.getKey());
    for(Map.Entry<String,List<Integer>> e: rev.entrySet()) System.out.println(e.getKey()+":"+e.getValue().size());
  }
}