import java.util.*;
public class MaxKey {
  public static void main(String[] args){
    Map<String,Integer> m = Map.of("A",10,"B",20,"C",15);
    String maxKey = null;
    int max = Integer.MIN_VALUE;
    for(Map.Entry<String,Integer> e: m.entrySet()){
      if(e.getValue()>max){ max = e.getValue(); maxKey = e.getKey(); }
    }
    System.out.println(maxKey);
  }
}