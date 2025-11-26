import java.util.*;
public class CountryCapital {
  public static void main(String[] args){
    Map<String,String> m = new TreeMap<>();
    m.put("India","New Delhi");m.put("Japan","Tokyo");m.put("France","Paris");m.put("Brazil","Brasilia");
    m.put("USA","Washington");m.put("UK","London");m.put("Germany","Berlin");m.put("Canada","Ottawa");
    String c = "India";
    System.out.println(m.getOrDefault(c,"Unknown country"));
    for(Map.Entry<String,String> e: m.entrySet()) System.out.println(e.getKey()+":"+e.getValue());
  }
}