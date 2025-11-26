import java.util.*;
public class ExamResults {
  public static void main(String[] args){
    Map<String,Map<String,Integer>> subj = new HashMap<>();
    Map<String,Integer> math = new HashMap<>();
    math.put("A",95); math.put("B",78); math.put("C",88);
    Map<String,Integer> eng = new HashMap<>();
    eng.put("A",85); eng.put("B",91); eng.put("C",72);
    subj.put("Math", math); subj.put("Eng", eng);
    for(Map.Entry<String,Map<String,Integer>> e: subj.entrySet()){
      String subject = e.getKey();
      Map<String,Integer> marks = e.getValue();
      String top=null; int max=-1; double sum=0;
      for(Map.Entry<String,Integer> s: marks.entrySet()){ if(s.getValue()>max){max=s.getValue(); top=s.getKey();} sum+=s.getValue();}
      double avg = sum/marks.size();
      System.out.println(subject+" Top:"+top+" Avg:"+avg);
    }
  }
}