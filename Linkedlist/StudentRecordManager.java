import java.util.*;

class Student {
    int roll, age;
    String name, grade;
    Student next;
    Student(int r,String n,int a,String g){
        roll=r; name=n; age=a; grade=g;
    }
}

public class StudentRecordManager {
    static Student head;

    static void addStart(Student s){
        s.next=head;
        head=s;
    }

    static void addEnd(Student s){
        if(head==null){head=s;return;}
        Student t=head;
        while(t.next!=null) t=t.next;
        t.next=s;
    }

    static void del(int r){
        if(head==null) return;
        if(head.roll==r){head=head.next;return;}
        Student t=head;
        while(t.next!=null && t.next.roll!=r) t=t.next;
        if(t.next!=null) t.next=t.next.next;
    }

    static Student find(int r){
        Student t=head;
        while(t!=null){
            if(t.roll==r) return t;
            t=t.next;
        }
        return null;
    }

    static void show(){
        Student t=head;
        while(t!=null){
            System.out.println(t.roll+" "+t.name+" "+t.age+" "+t.grade);
            t=t.next;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int r=sc.nextInt();
            String name=sc.next();
            int age=sc.nextInt();
            String g=sc.next();
            addEnd(new Student(r,name,age,g));
        }
        int x=sc.nextInt();
        Student s=find(x);
        if(s!=null) s.grade=sc.next();
        show();
    }
}
