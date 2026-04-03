import java.util.*;

class Ticket{
    int id,seat;
    String user,movie,time;
    Ticket next;
    Ticket(int i,String u,String m,int s,String t){
        id=i; user=u; movie=m; seat=s; time=t;
    }
}

public class TicketReservationSystem {
    static Ticket head;

    static void add(Ticket t){
        if(head==null){head=t;t.next=t;return;}
        Ticket x=head;
        while(x.next!=head) x=x.next;
        x.next=t;
        t.next=head;
    }

    static void show(){
        if(head==null) return;
        Ticket t=head;
        do{
            System.out.println(t.id+" "+t.user+" "+t.movie+" "+t.seat+" "+t.time);
            t=t.next;
        }while(t!=head);
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(new Ticket(sc.nextInt(),sc.next(),sc.next(),sc.nextInt(),sc.next()));
        }
        show();
    }
}
