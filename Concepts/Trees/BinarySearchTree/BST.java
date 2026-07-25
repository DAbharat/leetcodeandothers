class BST {
    public class Node {
        int val;
        Node left;
        Node right;
        int height;
        public Node(int val) {
            this.val = val;
        }

        public int getValue() {
            return val;
        }
    }
    private Node root;
    public BST(){}

    public int height(Node node) {
        if(node==null) return -1;
        return node.height;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public void insert(int val) {
        root = insert(root, val);
    }

    Node insert(Node node, int val) {
        if(node==null) {
            node = new Node(val);
            return node;
        }

        if(val<node.val) {
            node.left=insert(node.left, val);
        }
        if(val>node.val) {
            node.right=insert(node.right, val);
        }
        node.height=Math.max(height(node.left), height(node.right)) + 1;
        return node;
    }

    public boolean balanced() {
        return balanced(root);
    }

    boolean balanced(Node node) {
        if(node==null) return true;

        return Math.abs(height(node.left)-height(node.right)) <= 1  && balanced(node.left) && balanced(node.right);
    }

    public void display() {
        display(this.root, "Root node: ");
    }

    void display(Node node, String details) {
        if(node==null) return;
        System.out.println(details + node.val);
        display(node.left, "Left child of " + node.val + " : ");
        display(node.right, "Right child of " + node.val + " : ");
    }

    public void populate(int[] nums) {
        for(int i=0; i<nums.length; i++) {
            this.insert(nums[i]);
        }
    }

    public void sorted(int[] nums, int start, int end) {
        if(start>=end) return;
        int mid = start+end / 2;
        this.insert(nums[mid]);
        sorted(nums, start, mid);
        sorted(nums, mid+1, end);
    }

    public void preOrder() {
        preOrder(root);
    }
    void preOrder(Node node) {
        if(node==null) return;

        System.out.print(node.val + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    public void inOrder() {
        inOrder(root);
    }
    void inOrder(Node node) {
        if(node==null) return;

        inOrder(node.left);
        System.out.print(node.val + " ");
        inOrder(node.right);
    }

    public void postOrder() {
        postOrder(root);
    }
    void postOrder(Node node) {
        if(node==null) return;

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.val + " ");
    }
}