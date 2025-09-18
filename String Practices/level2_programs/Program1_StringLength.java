
import java.util.*;

public class Program1_StringLength {
    public static int customLength(String s) {
        int count = 0;
        try {
            while (true) {
                s.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("Custom Length: " + customLength(s));
        System.out.println("Built-in Length: " + s.length());
    }
}
