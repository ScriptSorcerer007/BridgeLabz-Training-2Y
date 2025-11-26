import java.util.*;
public class ShoppingCart {
  public static void main(String[] args){
    Map<String,Double> cart = new LinkedHashMap<>();
    cart.put("Laptop",40000.0); cart.put("Mouse",800.0); cart.put("Keyboard",1500.0);
    double total=0;
    for(double v: cart.values()) total+=v;
    if(total>5000) total = total*0.9;
    cart.remove("Mouse");
    System.out.println("Total:"+total);
    for(Map.Entry<String,Double> e: cart.entrySet()) System.out.println(e.getKey()+":"+e.getValue());
  }
}