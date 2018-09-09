import java.util.LinkedList;
import java.util.Queue;

public class BreadthFirstSearch {
    public static void main(String[] args) {
        bypassWidth(Utils.generateTree());
    }

    private static void bypassWidth(Tree root) {
        Queue queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            root = (Tree) queue.poll();
            System.out.println(root.getLetter());
            if(root.getLeft() != null) {
                queue.add(root.getLeft());
            }
            if(root.getRight() != null) {
                queue.add(root.getRight());
            }
        }
    }
}
