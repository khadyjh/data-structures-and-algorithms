package challenge30.binaryTree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class BinaryTree<T> {

    public BinaryNode<Integer> root;
    List<T> content;

    public BinaryTree() {
        this.root = null;
        this.content = new ArrayList<>();
    }

    public BinaryNode<Integer> getRoot() {
        return root;
    }

    public void setRoot(BinaryNode<Integer> root) {
        this.root = root;
    }

    public List<T> inOrder(BinaryNode<T> node) {
        if (node != null) {
            inOrder(node.left);
            this.content.add(node.data);
            inOrder(node.right);
        }
        return content;
    }

    public List<T> preOrder(BinaryNode<T> node) {
        if (node == null) {
            return null;
        }
        this.content.add(node.data);
        preOrder(node.left);
        preOrder(node.right);
        return content;
    }

    public List<T> postOrder(BinaryNode<T> node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            this.content.add(node.data);
        }
        return content;
    }

//    public void levelOrderTraversalLoop() {
//        if (root != null) {
//            Queue<BinaryNode> queue = new Queue<>();
//            queue.enqueue(root);
//
//            BTNode node;
//            while (!queue.isEmpty()) {
//                node = queue.dequeue();
//                System.out.print(node.getData() + " => ");
//                if (node.getLeft() != null) {
//                    queue.enqueue(node.getLeft());
//                }
//
//                if (node.getRight() != null) {
//                    queue.enqueue(node.getRight());
//                }
//            }
//        } else {
//            System.out.println("Tree empty");
//        }
//    }


    public ArrayList<Integer> preorderDepthFirst(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (root != null) {
            Stack<BinaryNode> stack=new Stack<>();
            stack.push(root);
            BinaryNode node;
            while (!stack.isEmpty()){
                node=stack.pop();
                arrayList.add((Integer) node.getData());
//                System.out.print(node.getData() +" => ");
                if(node.getRight() != null) {
                    stack.push(node.getRight());
                }
                if(node.getLeft() != null) {
                    stack.push(node.getLeft());
                }
            }
        }else {
            System.out.println("TREE IS EMPTY");
        }
        return arrayList;

    }
}