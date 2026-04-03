import java.util.*;

class Book{
    int id;
    String title,author,gen,stat;
    Book next,prev;
    Book(int i,String t,String a,String g,String s){
        id=i; title=t; author=a; gen=g; stat=s;
    }
}

public class LibraryManager {
    static Book head,tail;

    static void add(Book b){
        if(head==null){head=tail=b;return;}
        tail.next=b;
        b.prev=tail;
        tail=b;
    }

    static void show(){
        Book t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.title+" "+t.author+" "+t.gen+" "+t.stat);
            t=t.next;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(new Book(sc.nextInt(),sc.next(),sc.next(),sc.next(),sc.next()));
        }
        show();
    }
}
