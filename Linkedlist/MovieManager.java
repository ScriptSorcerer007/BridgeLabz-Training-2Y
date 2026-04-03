import java.util.*;

class Movie {
    String title, dir;
    int year;
    double rate;
    Movie next, prev;
    Movie(String t,String d,int y,double r){
        title=t; dir=d; year=y; rate=r;
    }
}

public class MovieManager {
    static Movie head, tail;

    static void add(Movie m){
        if(head==null){head=tail=m;return;}
        tail.next=m;
        m.prev=tail;
        tail=m;
    }

    static void del(String t){
        Movie x=head;
        while(x!=null && !x.title.equals(t)) x=x.next;
        if(x==null) return;
        if(x==head) head=head.next;
        if(x==tail) tail=tail.prev;
        if(x.prev!=null) x.prev.next=x.next;
        if(x.next!=null) x.next.prev=x.prev;
    }

    static void show(){
        Movie t=head;
        while(t!=null){
            System.out.println(t.title+" "+t.dir+" "+t.year+" "+t.rate);
            t=t.next;
        }
    }

    static void rev(){
        Movie t=tail;
        while(t!=null){
            System.out.println(t.title+" "+t.dir+" "+t.year+" "+t.rate);
            t=t.prev;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(new Movie(sc.next(),sc.next(),sc.nextInt(),sc.nextDouble()));
        }
        del(sc.next());
        show();
        rev();
    }
}
