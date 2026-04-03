import java.util.*;

class User{
    int id,age;
    String name;
    List<Integer> f=new ArrayList<>();
    User next;
    User(int i,String n,int a){
        id=i; name=n; age=a;
    }
}

public class SocialMediaFriends {
    static User head;

    static User find(int id){
        User t=head;
        while(t!=null){
            if(t.id==id) return t;
            t=t.next;
        }
        return null;
    }

    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            User u=new User(sc.nextInt(),sc.next(),sc.nextInt());
            u.next=head;
            head=u;
        }
        int a=sc.nextInt(), b=sc.nextInt();
        User u1=find(a), u2=find(b);
        if(u1!=null && u2!=null){
            u1.f.add(b);
            u2.f.add(a);
        }
        System.out.println(u1.f);
    }
}
