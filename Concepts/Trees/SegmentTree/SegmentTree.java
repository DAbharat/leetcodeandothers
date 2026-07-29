package Trees.SegmentTree;

public class SegmentTree {
    class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        public Node(int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }
    Node root;
    public SegmentTree(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    Node constructTree(int[] arr, int start, int end) {
        if(start==end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        
        int mid = start + (end-start) / 2;

        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);
        node.data = node.left.data + node.right.data;

        return node;
    }

    public void display() {
        display(this.root);
    }
    void display(Node node) {
        String str = "";

        if(node.left != null) {
            str = str + "Interval=[" + node.left.startInterval + "-" + node.left.endInterval + "] and data: " + node.left.data + "->"; 
        } else {
            str = str + "No left child";
        }

        str = str + "Interval=[" + node.startInterval + "-" + node.endInterval + "] and data: " + node.data + "->"; 

        if(node.right != null) {
            str = str + "Interval=[" + node.right.startInterval + "-" + node.right.endInterval + "] and data: " + node.right.data; 
        } else {
            str = str + "No right child";
        }

        System.out.println(str + "\n");

        if(node.left != null) display(node.left);
        if(node.right != null) display(node.right);
    }

    int query(Node node, int qsi, int qei) {
        if(node.startInterval>=qsi && node.endInterval<=qei) {
            return node.data;
        } else if(node.startInterval>qei || node.endInterval<qsi) {
            return 0;
        } else return query(node.left, qsi, qei) + query(node.right, qsi, qei);
    }

    public void update(int idx, int val) {
        this.root.data = update(this.root, idx, val);
    }
    int update(Node node, int idx, int val) {
        if(idx>=node.startInterval && idx<=node.endInterval) {
            if(idx==node.startInterval && idx==node.endInterval) {
                node.data = val;
                return node.data;
            } else {
                int leftAns = update(node.left, idx, val);
                int rightAns = update(node.right, idx, val);
                node.data = leftAns + rightAns;
                return node.data;
            }
        }
        return node.data;
    }
}
