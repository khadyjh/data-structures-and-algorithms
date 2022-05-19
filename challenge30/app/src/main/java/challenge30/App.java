/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

import challenge30.binaryTree.BinaryTree;
import challenge30.structure.HashMap;

import java.util.ArrayList;
import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println("Welcome to Hash Tables Class");

        HashMap<String, String> hashMap = new HashMap<>();
//        hashMap.put("JAVA", "JAVA");
//        hashMap.put("Amman", "Amman");
//        hashMap.put("Jordan", "Jordan");
////        hashMap.put("Bob", "Bob");
//        hashMap.put("jons", "jons");
////        hashMap.put("Quds", "Quds");

        HashMap<String, String> hashMap2 = new HashMap<>();
//        hashMap2.put("JAVA", "Bob");
//        hashMap2.put("Jordan", "Amman");
//        hashMap2.put("Carl", "Carl");
////        hashMap2.put("Bob", "Bob");
////        hashMap2.put("Carl", "Carl");
//        hashMap2.put("hash", "hash");


        System.out.println(leftJoinTable(hashMap,hashMap2));
//        System.out.println(hashMap.get("JAVA"));
//        System.out.println("**********************************************************");
//        System.out.println(hashMap.contains("Java"));
//        System.out.println("**********************************************************");
//
//        hashMap.Keys();
//
//
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//
//        java.util.HashMap<String,String> test=new java.util.HashMap<>();
//        test.put("key","value");
//        System.out.println(test);

//        HashMap<String, Integer> hashMap = new HashMap<>();
//        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        String result= hashMap.repeatedWord("It was a queer, sultry summer/ the summer they electrocuted the Rosenbergs, and I didn’t know what I was doing in New York...");
//        System.out.println("result => " + result);

//        BinaryTree<Integer> tree1=new BinaryTree<>();
//
//        //level 1
//        tree1.setRoot(new BinaryNode<>(150));
//        // level 2
//        tree1.getRoot().setLeft(new BinaryNode<>(100));
//        tree1.getRoot().setRight(new BinaryNode<>(250));
//        // level 3
//        tree1.getRoot().getLeft().setLeft(new BinaryNode<>(75));
//        tree1.getRoot().getLeft().setRight(new BinaryNode<>(160));
//
//        tree1.getRoot().getRight().setLeft(new BinaryNode<>(200));
//        tree1.getRoot().getRight().setRight(new BinaryNode<>(350));
//
//        //level 4
//        tree1.getRoot().getLeft().getRight().setLeft(new BinaryNode<>(125));
//        tree1.getRoot().getLeft().getRight().setRight(new BinaryNode<>(175));
//
//        tree1.getRoot().getRight().getRight().setLeft(new BinaryNode<>(300));
//        tree1.getRoot().getRight().getRight().setRight(new BinaryNode<>(500));
//
//
//        BinaryTree<Integer> tree2=new BinaryTree<>();
//        //level 1
//        tree2.setRoot(new BinaryNode<>(42));
//        // level 2
//        tree2.getRoot().setLeft(new BinaryNode<>(100));
//        tree2.getRoot().setRight(new BinaryNode<>(600));
//        // level 3
//        tree2.getRoot().getLeft().setLeft(new BinaryNode<>(15));
//        tree2.getRoot().getLeft().setRight(new BinaryNode<>(160));
//
//        tree2.getRoot().getRight().setLeft(new BinaryNode<>(200));
//        tree2.getRoot().getRight().setRight(new BinaryNode<>(350));
//
//        //level 4
//        tree2.getRoot().getLeft().getRight().setLeft(new BinaryNode<>(125));
//        tree2.getRoot().getLeft().getRight().setRight(new BinaryNode<>(175));
//
//        tree2.getRoot().getRight().getRight().setLeft(new BinaryNode<>(4));
//        tree2.getRoot().getRight().getRight().setRight(new BinaryNode<>(500));
//
////        System.out.println(tree1.preorderDepthFirst());
//
//        System.out.println(treeIntersection(tree1,tree2));


    }

    //////////////////////////////////////////////////// challenge 32 //////////////////////////////////


    public static List<Integer> treeIntersection(BinaryTree<Integer> tree1, BinaryTree<Integer> tree2){

        List<Integer> tree1List=tree1.preorderDepthFirst();
        List<Integer> tree2List=tree2.preorderDepthFirst();
        List<Integer> result=new ArrayList<>();
        


        HashMap<Integer,Integer> treeIntersection = new HashMap<>();

//        if(tree1List.size()>tree2List.size()){
//            for (int index = 0; index < tree1List.size(); index++) {
//                treeIntersection.put(tree1List.get(index),1);
//            }
//            for (int index = 0; index < tree2List.size(); index++) {
//               if(treeIntersection.contains(tree2List.get(index))){
//                   result.add(tree2List.get(index));
//               }
//            }
//
//        }else {
//            for (int index = 0; index < tree2List.size(); index++) {
//                treeIntersection.put(tree2List.get(index),1);
//            }
//            for (int index = 0; index < tree1List.size(); index++) {
//                if(treeIntersection.contains(tree1List.get(index))){
//                    result.add(tree1List.get(index));
//                }
//            }
//        }

        // only if size equals
        for (int i = 0; i < tree1List.size(); i++) {
            treeIntersection.put(tree1List.get(i),1);
        }

        for (int i = 0; i <tree2List.size(); i++) {
            if (treeIntersection.contains(tree2List.get(i))){
                result.add(tree2List.get(i));
            }
        }

       return result;


    }

    //////////////////////////////////////////////////// challenge 33 //////////////////////////////////

    public static List<String> leftJoinTable(HashMap<String,String> table1, HashMap<String,String> table2){
        List<String> result=new ArrayList<>();
        List<String> list1=table1.Keys();
        List<String> list2=table2.Keys();
        if(list2.size()==0){
            for (int i = 0; i < list1.size(); i++) {
                result.add(list1.get(i)+ ":"+ table1.get(list1.get(i))+":"+ null);
            }
            return result;
        }else if(list1.size()==0){
            return result;
        }
        for (int i = 0; i < list2.size(); i++) {
            if(table1.contains(list2.get(i))){
                result.add(list2.get(i) +":"+table1.get(list2.get(i))+":"+table2.get(list2.get(i)));
            }
            if(!table2.contains(list1.get(i))) {
                result.add(list1.get(i)+ ":"+ table1.get(list1.get(i))+":"+ null);
            }
        }
        return result;
    }

}
