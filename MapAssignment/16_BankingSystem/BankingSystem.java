import java.util.*;
public class Banking {
  public static void main(String[] args){
    Map<String,Double> m = new HashMap<>();
    m.put("AC100",5000.0); m.put("AC101",15000.0); m.put("AC102",25000.0); m.put("AC103",1000.0);
    m.put("AC104",35000.0); m.put("AC105",300.0);
    m.put("AC100", m.get("AC100")+2000);
    double withdraw = 6000;
    if(m.get("AC101")>=withdraw) m.put("AC101", m.get("AC101")-withdraw);
    List<Map.Entry<String,Double>> list = new ArrayList<>(m.entrySet());
    list.sort((a,b)->Double.compare(b.getValue(), a.getValue()));
    for(Map.Entry<String,Double> e: list) System.out.println(e.getKey()+":"+e.getValue());
    for(int i=0;i<3 && i<list.size();i++) System.out.println("Top"+(i+1)+":"+list.get(i).getKey());
  }
}