import java.util.*;
public class Inventory {
  public static void main(String[] args){
    Map<String,Integer> stock = new HashMap<>();
    stock.put("apple",50); stock.put("pen",10); stock.put("notebook",0);
    stock.put("apple", stock.get("apple") - 20);
    stock.put("pen", Math.max(0, stock.get("pen") - 12));
    stock.put("notebook", stock.getOrDefault("notebook",0) + 30);
    String q = "pencil";
    System.out.println(stock.getOrDefault(q, null)==null ? "not stocked" : stock.get(q));
    System.out.println("Out of stock:");
    for(Map.Entry<String,Integer> e: stock.entrySet()) if(e.getValue()<=0) System.out.println(e.getKey());
  }
}