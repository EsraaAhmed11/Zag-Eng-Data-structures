public class Tree {
    private class Node {
        private int value;

        private Node rightChild;
        private Node leftChild;

        public Node(int value) {
            this.value = value;
        }
    }

        private Node root;

        public void insert(int value) {
            Node node = new Node(value);
            if (root == null)
                root = node;

            else {
                Node parent = getParent(value);
                if (value >= parent.value)
                    parent.rightChild = node;
                else
                    parent.leftChild = node;
            }
        }

        private Node getParent(int value) {

            Node current = root;
            Node parent = root;

            while (current != null) {
                parent = current;
                if (value >= current.value)
                    current = current.rightChild;
                else

                    current = current.leftChild;
            }
            return parent;
        }

        public boolean find(int value) {

            Node current = root;
            while (current != null) {
                if (current.value == value)
                    return true;
                if (value >= current.value)
                    current = current.rightChild;
                else
                    current = current.leftChild;

            }
            return false;

        }

        public int max() {

            int max = root.value;
            Node current = root;
            while (current != null) {
                max = current.value;
                current = current.rightChild;
            }

            return max;
        }

        public void preorder() {

            preorder(root);
        }

        private void preorder(Node root) {
            if (root == null)
                return;

            System.out.println(root.value);
            preorder(root.leftChild);
            preorder(root.rightChild);
        }
    public void inorder() {

        inorder(root);
    }
        private void inorder(Node root) {
            if (root == null)
                return;
            inorder(root.leftChild);
            System.out.println(root.value);
            inorder(root.rightChild);
        }
    public void postorder() {

        postorder(root);
    }
    private void postorder(Node root) {
        if (root == null)
            return;
        postorder(root.leftChild);
        postorder(root.rightChild);
        System.out.println(root.value);

    }
    }




