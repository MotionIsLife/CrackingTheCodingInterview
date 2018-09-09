public class Tree {
    private char letter;
    private Tree left;
    private Tree right;

    public Tree(char letter) {
        this.letter = letter;
    }

    public Tree(char letter, Tree left, Tree right) {
        this.letter = letter;
        this.left = left;
        this.right = right;
    }

    public char getLetter() {
        return letter;
    }

    public void setLetter(char letter) {
        this.letter = letter;
    }

    public Tree getLeft() {
        return left;
    }

    public void setLeft(Tree left) {
        this.left = left;
    }

    public Tree getRight() {
        return right;
    }

    public void setRight(Tree right) {
        this.right = right;
    }
}
