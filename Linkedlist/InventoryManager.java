import java.util.*;

class Item{
    int id,qty;
    String name;
    double price;
    Item next;
    Item(int i,String n,int q,double p){
        id=i; name=n; qty=q; price=p;
    }
}

public class InventoryManager {
    static Item head;

    static void add(Item x){
        if(head==null){head=x;return;}
        Item t=head;
        while(t.next!=null) t=t.next;
        t.next=x;
    }

    static double total(){
        double s=0;
        Item t=head;
        while(t!=null){
            s+=t.qty*t.price;
            t=t.next;
        }
        return s;
    }

    static void show(){
        Item t=head;
        while(t!=null){
            System.out.println(t.id+" "+t.name+" "+t.qty+" "+t.price);
            t=t.next;
        }
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(new Item(sc.nextInt(),sc.next(),sc.nextInt(),sc.nextDouble()));
        }
        System.out.println(total());
        show();
    }
}
