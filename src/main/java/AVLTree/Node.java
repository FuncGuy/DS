package AVLTree;

public class Node {

    private int data;
    private BST leftNode;
    private BST rightNode;
    private int height;

    Node(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public BST getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BST leftNode) {
        this.leftNode = leftNode;
    }

    public BST getRightNode() {
        return rightNode;
    }

    public void setRightNode(BST rightNode) {
        this.rightNode = rightNode;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "" + this.data;
    }
}
