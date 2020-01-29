public class BinarySearchTree {

    static class BST {
        int value;
        BST left;
        BST right;

        public BST(int value) {
            this.value = value;
        }

        public BST insert(int value) {
            BST current = this;
            BST newNode = new BST(value);
            while (true) {
                if (value < current.value) {
                    if (current.left == null) {
                        current.left = newNode;
                        break;
                    } else {
                        current = current.left;
                    }
                } else if (current.right == null) {
                    current.right = newNode;
                    break;
                } else {
                    current = current.right;
                }
            }
            return this;
        }

        public boolean contains(int value) {
            BST current = this;
            while (current != null) {
                if (value < current.value) {
                    current = current.left;
                } else if (value > current.value) {
                    current = current.right;
                } else {
                    return true;
                }
            }
            return false;
        }

        public int getMinValue(){
            if(left == null){
                return value;
            }else{
                return left.getMinValue();
            }
        }

        public int getMaxValue(){
            if(right == null){
                return value;
            }else{
                return right.getMaxValue();
            }
        }

        public void inorder(BST root) {
            if (root == null)
                return;

            inorder(root.left);

            System.out.print(root.value + " ");

            inorder(root.right);
        }



       public BST remove(BST root, int key) {
            /* Base Case: If the tree is empty */
            if (root == null)  return root;

            /* Otherwise, recur down the tree */
            if (key < root.value)
                root.left = remove(root.left, key);
            else if (key > root.value)
                root.right = remove(root.right, key);

                // if key is same as root's key, then This is the node
                // to be deleted
            else
            {
                // node with only one child or no child
                if (root.left == null)
                    return root.right;
                else if (root.right == null)
                    return root.left;

                // node with two children: Get the inorder successor (smallest
                // in the right subtree)
                root.value = getMinValue();

                // Delete the inorder successor
                root.right = remove(root.right, root.value);
            }

            return root;
        }
    }
}

