package unit06;

public class BinaryNode {
    private int value;
    private BinaryNode left;
    private BinaryNode right;

    public BinaryNode(int value, BinaryNode left, BinaryNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public BinaryNode(int value) {
        this(value, null, null);
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public BinaryNode getLeft() {
        return left;
    }

    public void setLeft(BinaryNode left) {
        this.left = left;
    }

    public BinaryNode getRight() {
        return right;
    }

    public void setRight(BinaryNode right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "BinaryNode{value=" + value + 
            ", left=" + left + 
            ", right=" + right + "}";
    }

    public static void main(String[] args) {
        BinaryNode root = new BinaryNode(1);
        BinaryNode left = new BinaryNode(2);
        root.setLeft(left);
        BinaryNode right = new BinaryNode(3);
        root.setRight(right);

        System.out.println(root);
    }
    
}
