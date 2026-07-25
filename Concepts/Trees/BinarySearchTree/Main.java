public class Main {
    public static void main(String[] args) {
        BST tree = new BST();
        int[] nums = { 5,7,1,2,6,4,9,0,8,3,2};
        tree.populate(nums);
        tree.display();
        System.out.println(tree.balanced());
        tree.preOrder(); System.out.println();
        tree.inOrder(); System.out.println();
        tree.postOrder();
    }
}
