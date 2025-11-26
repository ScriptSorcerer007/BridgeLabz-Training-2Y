import java.nio.file.*;
import java.io.*;
import java.util.*;
public class WordFrequency {
  public static void main(String[] args) throws Exception {
    String input = "Hello world, hello Java!";
    input = input.replaceAll("[^a-zA-Z0-9\s]", "").toLowerCase();
    String[] words = input.split("\s+");
    Map<String,Integer> m = new HashMap<>();
    for(String w: words){
      m.put(w, m.getOrDefault(w,0)+1);
    }
    System.out.println(m);
  }
}