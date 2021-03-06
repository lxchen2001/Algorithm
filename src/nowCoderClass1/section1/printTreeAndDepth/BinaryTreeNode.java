package nowCoderClass1.section1.printTreeAndDepth;

/**
 * Created by Dell on 2017-04-13.
 */
public class BinaryTreeNode<T> {
    public first.printTreeAndDepth.BinaryTreeNode left;
    public first.printTreeAndDepth.BinaryTreeNode right;
    public T element;
    public BinaryTreeNode(){
        this.left=null;
        this.right=null;
        this.element=null;
    }
    public BinaryTreeNode(first.printTreeAndDepth.BinaryTreeNode left, first.printTreeAndDepth.BinaryTreeNode right, T element) {
        this.left = left;
        this.right = right;
        this.element = element;
    }

    public BinaryTreeNode(T element) {
        this.element = element;
    }

//    @Override
//    public String toString() {
//        return "BinaryTreeNode{" +
//                "left=" + left==null?"null":left.toString() +
//                ", right=" + right==null?"null":right.toString() +
//                ", element=" + element +
//                '}';
//}
}
