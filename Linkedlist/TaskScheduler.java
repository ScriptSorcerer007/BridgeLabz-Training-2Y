import java.util.*;

class Task{
    int id,pri;
    String name,date;
    Task next;
    Task(int i,String n,int p,String d){
        id=i; name=n; pri=p; date=d;
    }
}

public class TaskScheduler {
    static Task head;

    static void add(Task t){
        if(head==null){
            head=t; t.next=t; return;
        }
        Task x=head;
        while(x.next!=head) x=x.next;
        x.next=t;
        t.next=head;
    }

    static void del(int id){
        if(head==null) return;
        Task c=head, p=null;
        do{
            if(c.id==id){
                if(p!=null) p.next=c.next;
                if(c==head) head=c.next;
                break;
            }
            p=c; c=c.next;
        }while(c!=head);
    }

    static void show(){
        if(head==null) return;
        Task t=head;
        do{
            System.out.println(t.id+" "+t.name+" "+t.pri+" "+t.date);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(new Task(sc.nextInt(),sc.next(),sc.nextInt(),sc.next()));
        }
        del(sc.nextInt());
        show();
    }
}
