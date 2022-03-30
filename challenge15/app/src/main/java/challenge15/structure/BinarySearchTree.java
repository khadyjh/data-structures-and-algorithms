package challenge15.structure;

import challenge15.data.BinaryNode;
import challenge15.data.Node;

public class BinarySearchTree<T extends Comparable<T>> {

    public enum TraversalOrder {
        INORDER,
        PREORDER,
        POSTORDER
    }

    private Node<T> root;
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


}