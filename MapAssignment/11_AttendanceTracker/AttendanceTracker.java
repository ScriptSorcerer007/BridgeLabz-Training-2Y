import java.util.*;
public class Attendance {
  public static void main(String[] args){
    Map<String,Integer> days = new HashMap<>();
    String[] students = {"A","B","C","D","E"};
    for(String s: students) days.put(s,0);
    List<List<String>> month = new ArrayList<>();
    month.add(Arrays.asList("A","B","C"));
    month.add(Arrays.asList("A","C","D"));
    month.add(Arrays.asList("B","C","E"));
    month.add(Arrays.asList("A","B","C","D","E"));
    month.add(Arrays.asList("C","D"));
    int daysCount = month.size();
    for(List<String> present: month) for(String p: present) days.put(p, days.getOrDefault(p,0)+1);
    for(Map.Entry<String,Integer> e: days.entrySet()) if(e.getValue()<2) System.out.println(e.getKey());
  }
}