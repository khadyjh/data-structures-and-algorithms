/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ziplinklist;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
//        System.out.println(new App().getGreeting());


        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.insert(1);
        linkedList1.append(2);
//        linkedList1.append(3);
//        linkedList1.append(4);
//        linkedList1.append(5);

//        System.out.println(linkedList1);

        LinkedList<String>  linkedList2 = new LinkedList<>();
        linkedList2.insert("t");
        linkedList2.append("a");
        linkedList2.append("x");
        linkedList2.append("x");
//        linkedList2.append("x");
        linkedList2.append("t");
        linkedList2.append("a");
        linkedList2.append("t");

        System.out.println(linkedList2.findMiddleNode(linkedList2).value);

        linkedList2.palindrome1(linkedList2);
        System.out.println( linkedList2.palindrome1(linkedList2));
//        System.out.println(linkedList1);
////        System.out.println(linkedList2);
//        LinkedList<Integer> list1=new LinkedList<>();
//        linkedList1.reverseSinglyLinkedList();
//        System.out.println(linkedList1);
//        linkedList2.reverse(linkedList2);
//        System.out.println(linkedList2.palindrome(linkedList2));

//        System.out.println("//////////////////////////////zipped list//////////////////////////////");
//        System.out.println(linkedList1.zipLists(linkedList1,linkedList2));
    }
}