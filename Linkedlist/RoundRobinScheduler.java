import java.util.*;

class Proc{
    int id,bt,pri;
    Proc next;
    Proc(int i,int b,int p){
        id=i; bt=b; pri=p;
    }
}

public class RoundRobinScheduler {
    static Proc head;

    static void add(Proc p){
        if(head==null){head=p;p.next=p;return;}
        Proc t=head;
        while(t.next!=head) t=t.next;
        t.next=p;
        p.next=head;
    }

    static void run(int q){
        Proc c=head, p=null;
        while(head!=null){
            if(c.bt<=q){
                System.out.println("Done "+c.id);
                if(c==head && c.next==head){head=null;break;}
                if(p!=null) p.next=c.next;
                if(c==head) head=c.next;
                c=c.next;
            }else{
                c.bt-=q;
                p=c;
                c=c.next;
            }
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(new Proc(sc.nextInt(),sc.nextInt(),sc.nextInt()));
        }
        int q=sc.nextInt();
        run(q);
    }
}
