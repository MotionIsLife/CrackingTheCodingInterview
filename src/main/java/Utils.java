public class Utils {
    public static Tree generateTree() {
        Tree tree = new Tree('e');
        Tree child1 = new Tree('d');
        Tree child2 = new Tree('h');
        Tree child3 = new Tree('a');
        Tree child4 = new Tree('c');
        Tree child5 = new Tree('y');
        Tree child6 = new Tree('z');

        tree.setLeft(child1);
        tree.setRight(child2);

        child1.setLeft(child3);
        child1.setRight(child4);

        child2.setLeft(child5);
        child2.setRight(child6);
        return tree;
    }
}
