
import java.util.*;

public class Program5_CountVowelsConsonants {
    public static String checkChar(char c) {
        if (c >= 'A' && c <= 'Z') c = (char)(c + 32);
        if (c >= 'a' && c <= 'z') {
            if ("aeiou".indexOf(c) != -1) return "Vowel";
            else return "Consonant";
        }
        return "Not a Letter";
    }
    public static int[] countVC(String s) {
        int v = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            String res = checkChar(s.charAt(i));
            if (res.equals("Vowel")) v++;
            else if (res.equals("Consonant")) c++;
        }
        return new int[]{v, c};
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int[] res = countVC(s);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);
    }
}
