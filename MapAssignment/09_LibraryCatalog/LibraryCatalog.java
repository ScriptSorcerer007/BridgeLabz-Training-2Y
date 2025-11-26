import java.util.*;
public class Library {
  public static void main(String[] args){
    Map<String,String> m = new TreeMap<>();
    m.put("978-123","Java Programming");
    m.put("978-456","Data Structures");
    String isbn = "978-123";
    System.out.println(m.containsKey(isbn)?m.get(isbn):"Book not found");
    m.remove("978-456");
    for(Map.Entry<String,String> e: m.entrySet()) System.out.println(e.getKey()+":"+e.getValue());
    String titleSearch = "Java Programming";
    boolean found=false;
    for(Map.Entry<String,String> e: m.entrySet()) if(e.getValue().equals(titleSearch)){ System.out.println(e.getKey()); found=true;}
    if(!found) System.out.println("Not found by title");
  }
}