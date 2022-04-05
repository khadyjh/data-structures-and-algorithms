package challenge18;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree<T extends Comparable<T>>{
    private Node<T> root;

    public BinaryTree() {
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    public ArrayList<T> preorderDepthFirst(){
        ArrayList<T> arrayList=new ArrayList<>();
        if (root != null) {
            Stack<Node> stack=new Stack<>();
            stack.push(root);
            Node node;
            while (!stack.isEmpty()){
                node=stack.pop();
                arrayList.add((T) node.getData());
                System.out.print(node.getData() +" => ");
                if(node.getRightNode() != null) {
                    stack.push(node.getRightNode());
                }
                if(node.getLeftNode() != null) {
                    stack.push(node.getLeftNode());
                }
            }
        }else {
            System.out.println("TREE IS EMPTY");
        }
        return arrayList;

    }

    public BinaryTree<String> fizzBuzzTree(BinaryTree<Integer> binaryTree){
        if(binaryTree.getRoot()==null){
            System.out.println("null");
        }
        BinaryTree<String> resultTree=new BinaryTree<>();
       resultTree.root= fizzBuzzTree(binaryTree.getRoot());
       return resultTree;

    }

    public Node<String> fizzBuzzTree(Node<Integer> node){
        if(node==null){
            return null;
        }

      Node<String> fizzBuzz=new Node<>();
        if((node.getData()%5)==0 && (node.getData()%3)==0){
            fizzBuzz.setData("FizzBuzz");
        } else if(node.getData()%5==0){
            fizzBuzz.setData("Buzz");
        }else if(node.getData()%3==0){
            fizzBuzz.setData("Fizz");
        }else {
            fizzBuzz.setData(Integer.toString(node.getData()));
        }

        fizzBuzz.setLeftNode(fizzBuzzTree(node.getLeftNode()));
        fizzBuzz.setRightNode(fizzBuzzTree(node.getRightNode()));

        return fizzBuzz;
    }






}
