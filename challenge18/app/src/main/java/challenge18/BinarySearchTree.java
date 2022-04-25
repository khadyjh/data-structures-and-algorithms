package challenge18;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinarySearchTree<T extends Comparable<T>> {

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER,
    }

    private Node<T> root;

    public Node<T> getRoot() {
        return root;
    }

    private int size;

    public void traverse(TraversalOrder order) {
        switch (order) {
            case INORDER:
                inOrder(root);
                break;
            case PREORDER:
                preOrder(root);
                break;
            case POSTORDER:
                postOrder(root);
                break;
            default:
        }
    }

    private void inOrder(Node<T> treeNode) {
        if (treeNode == null) { // base case
            return;
        }

        inOrder(treeNode.getLeftNode()); // left

        printNode(treeNode); // root

        inOrder(treeNode.getRightNode()); // right
    }

    private void preOrder(Node<T> treeNode) {

        if (treeNode == null) {
            return;
        }

        printNode(treeNode);

        preOrder(treeNode.getLeftNode());

        preOrder(treeNode.getRightNode());
    }

    private void postOrder(Node<T> treeNode) {
        if (treeNode == null) {
            return;
        }

        postOrder(treeNode.getLeftNode());

        postOrder(treeNode.getRightNode());

        printNode(treeNode);
    }

    private void printNode(Node<T> node) {
        // implement this
        System.out.print(node.getData()+ " => ");
    }

    public int size() {
        return size;
    }

    public boolean isTreeEmpty() {
        return root == null;
    }

    ////////////////////////////////challenge 15////////////////////////////////////////
    public void insert(T data) {
        if (isTreeEmpty()) {
            root = new BinaryNode<>(data);
            size++;
        } else {
            insert(data, root);
        }
    }

    private void insert(T data, Node<T> root) {
        if(data.compareTo(root.getData())<0){
            if(root.getLeftNode()!=null){
                insert(data,root.getLeftNode());
            }else {
                Node<T> newNode=new BinaryNode<>(data);
                root.setLeftNode(newNode);
                size++;
            }
        }else if(data.compareTo(root.getData())>0){
            if(root.getRightNode()!=null){
                insert(data,root.getRightNode());
            }else {
                Node<T> newNode=new BinaryNode<>(data);
                root.setRightNode(newNode);
                size++;
            }
        }
        // implement this
    }

    // contains method
    public boolean search(T searchTerm) {
        if (isTreeEmpty()) {
            return false;
        } else {
            return searchHelper(searchTerm, root);
        }
    }

    private boolean searchHelper(T searchTerm, Node<T> root) {
        // implement this
        if(root==null){
            return false;
        }
        if(searchTerm.compareTo(root.getData())==0){
            return true;
        }else if(searchTerm.compareTo(root.getData())>0){
            return searchHelper(searchTerm,root.getRightNode());
        }else if(searchTerm.compareTo(root.getData())<0){
            return searchHelper(searchTerm,root.getLeftNode());
        }

        return false;
    }

    public void oddSum(Node<Integer> treeNode){


        if (treeNode == null) { // base case

            return;
        }

        int data=treeNode.getData();
        if(data%2!=0){
            List<Integer> oddList=new ArrayList<>();
            oddList.add(data);
        }

        oddSum(treeNode.getLeftNode()); // left

        oddSum(treeNode); // root

        oddSum(treeNode.getRightNode()); // right
    }


    void inorder()
    {
        if (root == null)
            return;


        Stack<Node> s = new Stack<Node>();
        Node curr = root;

        // traverse the tree
        while (curr != null || s.size() > 0)
        {

            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.getLeftNode();
            }

            /* Current must be NULL at this point */
            curr = s.pop();

            System.out.print(curr.getData() + " ");

            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.getRightNode();
        }
    }


    void inorder1() {

        inorderRec((Node<Integer>) root);

    }


    void inorderRec(Node<Integer> root)
    {
        if (root != null) {
            inorderRec(root.getLeftNode());
            System.out.println(root.getData()+" kjhjgfd ");
            inorderRec(root.getRightNode());
        }
    }

    public static int sum = 0;

    public int sumOfOdds(Node <T> root){
        if(root == null)
            return 0;
        int rootValue = ((Integer)root.getData());
        if (rootValue % 2 != 0)
            sum=sum + rootValue;

        if(root.getLeftNode() !=null){
            sumOfOdds(root.getLeftNode());
        }
        if(root.getRightNode()!=null){
            sumOfOdds(root.getRightNode());
        }
        return sum;
    }


}
