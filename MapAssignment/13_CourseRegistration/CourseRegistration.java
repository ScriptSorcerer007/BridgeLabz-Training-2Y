import java.util.*;
public class CourseReg {
  public static void main(String[] args){
    Map<String,Integer> m = new HashMap<>();
    m.put("CS101",48); m.put("CS102",4); m.put("CS103",55); m.put("CS104",2); m.put("CS105",60);
    m.put("CS101", Math.min(100, m.get("CS101")+3));
    m.put("CS102", Math.max(0, m.get("CS102")-1));
    System.out.println("Near full:");
    for(Map.Entry<String,Integer> e: m.entrySet()) if(e.getValue()>=50) System.out.println(e.getKey());
    System.out.println("Under-subscribed:");
    for(Map.Entry<String,Integer> e: m.entrySet()) if(e.getValue()<5) System.out.println(e.getKey());
  }
}