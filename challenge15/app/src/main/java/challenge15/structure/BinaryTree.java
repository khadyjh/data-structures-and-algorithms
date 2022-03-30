package challenge15.structure;

import challenge15.Queue.Queue;
import challenge15.data.BTNode;

import java.util.ArrayList;
import java.util.Stack;


public class BinaryTree {

    private BTNode root;

    public BTNode getRoot() {
        return root;
    }

    public void setRoot(BTNode root) {
        this.root = root;
    }

    public void levelOrderTraversalLoop() {
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);

            BTNode node;
            while (!queue.isEmpty()) {
                node = queue.dequeue();
                System.out.print(node.getData() + " => ");
                if (node.getLeft() != null) {
                    queue.enqueue(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.enqueue(node.getRight());
                }
            }
        } else {
            System.out.println("Tree empty");
        }
    }

    public void levelOrderTraversalRecursive() {
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);
            levelOrderTraversalRecursive(queue);
        } else {
            System.out.println("Tree is empty");
        }
    }

    private void levelOrderTraversalRecursive(Queue<BTNode> queue) {
        // implement this
    }

    ////////////////////////////////challenge 15////////////////////////////////////////

    // return array for testing
    public ArrayList<Integer> preorderDepthFirst(){
        ArrayList<Integer> arrayList=new ArrayList<>();
        if (root != null) {
            Stack<BTNode> stack=new Stack<>();
            stack.push(root);
            BTNode node;
            while (!stack.isEmpty()){
                node=stack.pop();
                arrayList.add(node.getData());
                System.out.print(node.getData() +" => ");
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

    public ArrayList<Integer> inorderDepthFirst(){

        ArrayList<Integer> arrayList=new ArrayList<>();
        if(root!=null){
            Stack<BTNode> stack=new Stack<>();
            BTNode node=root;

            while (node != null || !stack.isEmpty()){
                while (node!=null){
                    stack.push(node);
                    node=node.getLeft();
                }
                node=stack.pop();
                arrayList.add(node.getData());
                System.out.print(  node.getData() + " => ");
                node=node.getRight();


           }
        }else {
            System.out.println("TREE IS EMPTY");
        }
        return arrayList;
    }

    public void postorderDepthFirst(){
        if(root==null){
            return;
        }
        postorderDepthFirst(root.getLeft());
        postorderDepthFirst(root.getRight());
        System.out.print(root.getData() +" => ");

    }

    public void postorderDepthFirst(BTNode treNode){
        if(treNode==null){
            return;
        }
        postorderDepthFirst(treNode.getLeft());
        postorderDepthFirst(treNode.getRight());
        System.out.print(treNode.getData() +" => ");

    }

    ////////////////////////////////challenge 16////////////////////////////////////////
    public int maxTree(){
        int max=0;
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);

            BTNode node;
            while (!queue.isEmpty()) {
                node = queue.dequeue();
                if(node.getData()>max){
                    max=node.getData();
                }

                if (node.getLeft() != null) {
                    queue.enqueue(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.enqueue(node.getRight());
                }
            }
        }
        return max;
    }


    @Override
    public String toString() {
        String str="";
        if (root != null) {
            Queue<BTNode> queue = new Queue<>();
            queue.enqueue(root);

            BTNode node;
            while (!queue.isEmpty()) {
                node = queue.dequeue();
               str=str+node.getData()+" => ";
                if (node.getLeft() != null) {
                    queue.enqueue(node.getLeft());
                }

                if (node.getRight() != null) {
                    queue.enqueue(node.getRight());
                }
            }
            return "binary tree => "+ str ;
        }else
            return "binary tree => "+ root;

    }
}