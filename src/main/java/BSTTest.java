public class BSTTest {

    static BinarySearchTree.BST test1;
    /*static BinarySearchTree.BST test2;
    static BinarySearchTree.BST test3;
    static BinarySearchTree.BST test4;*/

    static {

        test1 = new BinarySearchTree.BST(10); // root

            test1
                .insert(5)
                .insert(15)
                .insert(5)
                .insert(2)
                .insert(14)
                .insert(22);

            test1.inorder(test1);

        System.out.println(test1.contains(2));

        System.out.println("Minimum Value " + test1.getMinValue());

        System.out.println("Maximum Value " + test1.getMaxValue());

        test1.remove(test1,10);

        test1.inorder(test1);


    }

    public static void main(String[] args) {

    }
}
