import java.util.*;
public class EmployeeSalary {
  public static void main(String[] args){
    Map<String,Double> m = new HashMap<>();
    m.put("A",50000.0); m.put("B",75000.0); m.put("C",60000.0); m.put("D",90000.0); m.put("E",90000.0); m.put("F",40000.0);
    m.put("C", m.get("C")*1.10);
    double sum=0; double max=Double.MIN_VALUE;
    for(double v: m.values()){ sum+=v; if(v>max) max=v; }
    double avg = sum/m.size();
    System.out.println("Average:"+avg);
    for(Map.Entry<String,Double> e: m.entrySet()) if(e.getValue()==max) System.out.println(e.getKey());
  }
}