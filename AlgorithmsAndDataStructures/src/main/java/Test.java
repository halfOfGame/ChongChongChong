import Important.MyTree;

public class Test {

    public static void main(String[] args) {
        MyTree tree = new MyTree(new Integer[]{1,2,3,4,5,6,7});
        tree.inTraverseTree_Recursion(tree.head);
        System.out.println();
        tree.inTraverseTree_Iteration(tree.head);
        System.out.println();
        tree.inTraverseTree_Iteration_Improve(tree.head);
    }
}
