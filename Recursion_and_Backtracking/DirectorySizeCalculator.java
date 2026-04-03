import java.util.*;

class Node {
    String name;
    int size;
    boolean isFile;
    List<Node> list = new ArrayList<>();

    Node(String n, int s, boolean f) {
        name = n;
        size = s;
        isFile = f;
    }
}

public class DirectorySizeCalculator {

    static int calc(Node n) {
        if (n.isFile) return n.size;
        int sum = 0;
        for (Node x : n.list) {
            sum += calc(x);
        }
        return sum;
    }

    public static void main(String[] args) {
        Node project = new Node("project", 0, false);

        Node src = new Node("src", 0, false);
        src.list.add(new Node("main.java", 100, true));
        src.list.add(new Node("utils.java", 50, true));

        Node docs = new Node("docs", 0, false);
        docs.list.add(new Node("readme.txt", 10, true));

        Node guides = new Node("guides", 0, false);
        guides.list.add(new Node("setup.pdf", 200, true));
        docs.list.add(guides);

        project.list.add(src);
        project.list.add(docs);
        project.list.add(new Node("config.xml", 20, true));

        int total = calc(project);
        System.out.println(total + " KB");
    }
}
