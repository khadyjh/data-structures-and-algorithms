/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge15;

import challenge15.data.BTNode;
import challenge15.data.BinaryNode;
import challenge15.structure.BinarySearchTree;
import challenge15.structure.BinaryTree;

public class App {


    public static void main(String[] args) {

//        BinaryTree binaryTree=new BinaryTree();
//        binaryTree.setRoot(new BTNode("A")); // level 1
//
//        // level 2
//        binaryTree.getRoot().setLeft(new BTNode("B"));
//        binaryTree.getRoot().setRight(new BTNode("C"));
//
//        // level 3
//        binaryTree.getRoot().getLeft().setLeft(new BTNode("D"));
//        binaryTree.getRoot().getLeft().setRight(new BTNode("E"));
//
//        binaryTree.getRoot().getRight().setLeft(new BTNode("F"));
//        binaryTree.getRoot().getRight().setRight(new BTNode("h"));


//        System.out.println("level by level order => ");
//        binaryTree.levelOrderTraversalLoop();
//        System.out.println("\n pre order  ");
//        binaryTree.preorderDepthFirst();
//        System.out.println("\n in order  ");
//        binaryTree.inorderDepthFirst();
//        System.out.println("\n post order  ");
//        binaryTree.postorderDepthFirst();


//        BinarySearchTree<Integer> binarySearchTree=new BinarySearchTree<>();
//        binarySearchTree.insert(10);
//        binarySearchTree.insert(20);
//        binarySearchTree.insert(70);
//        binarySearchTree.insert(5);
//        binarySearchTree.insert(3);
//
//        binarySearchTree.traverse(BinarySearchTree.TraversalOrder.INORDER);
//        System.out.println(binarySearchTree.search(20));


        BinaryTree binaryTree1=new BinaryTree();

       binaryTree1.setRoot(new BTNode(10));

       binaryTree1.getRoot().setLeft(new BTNode(2));
       binaryTree1.getRoot().setRight(new BTNode(3));


       binaryTree1.getRoot().getLeft().setLeft(new BTNode(20));
       binaryTree1.getRoot().getLeft().setRight(new BTNode(30));


        System.out.println(binaryTree1);

//       binaryTree1.levelOrderTraversalLoop();
//
//        System.out.println('\n');
//
//       binaryTree1.postorderDepthFirst();
//
//        System.out.println('\n');
//
//        System.out.println(binaryTree1.maxTree());

    }
}
