import java.util.*;
class Employee {
  String name, dept;
  Employee(String n,String d){name=n;dept=d;}
  public String toString(){return name;}
}
public class GroupBy {
  public static void main(String[] args){
    List<Employee> list = Arrays.asList(new Employee("Alice","HR"), new Employee("Bob","IT"), new Employee("Carol","HR"));
    Map<String,List<Employee>> m = new HashMap<>();
    for(Employee e: list) m.computeIfAbsent(e.dept,k->new ArrayList<>()).add(e);
    System.out.println(m);
  }
}