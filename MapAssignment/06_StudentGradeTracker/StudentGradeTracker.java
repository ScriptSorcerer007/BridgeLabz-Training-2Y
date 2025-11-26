import java.util.*;
public class StudentGradeTracker {
  public static void main(String[] args){
    Map<String,Double> m = new TreeMap<>();
    m.put("Rohan",85.0); m.put("Meera",92.5); m.put("Amit",76.0);
    m.put("Amit",88.0);
    m.remove("Rohan");
    for(Map.Entry<String,Double> e: m.entrySet()) System.out.println(e.getKey()+":"+e.getValue());
  }
}