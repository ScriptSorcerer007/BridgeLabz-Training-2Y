import java.util.*;

class State{
    String text;
    State next,prev;
    State(String t){text=t;}
}

public class TextEditorUndoRedo {
    static State cur;

    static void add(String t){
        State s=new State(t);
        if(cur!=null){
            cur.next=s;
            s.prev=cur;
        }
        cur=s;
    }

    static void undo(){
        if(cur!=null && cur.prev!=null) cur=cur.prev;
    }

    static void redo(){
        if(cur!=null && cur.next!=null) cur=cur.next;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            add(sc.next());
        }
        undo();
        redo();
        System.out.println(cur.text);
    }
}
