/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package ziplinklist;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());


        LinkedList<Integer> linkedList1 = new LinkedList<>();
        linkedList1.insert(1);
        linkedList1.append(2);
//        linkedList1.append(3);
//        linkedList1.append(4);
//        linkedList1.append(5);

        System.out.println(linkedList1);

        LinkedList<Integer>  linkedList2 = new LinkedList<>();
        linkedList2.insert(6);
//        linkedList2.append(7);
//        linkedList2.append(8);
//        linkedList2.append(9);
//        linkedList2.append(10);

        System.out.println(linkedList2);


        System.out.println("//////////////////////////////zipped list//////////////////////////////");
        System.out.println(linkedList1.zipLists(linkedList1,linkedList2));
    }
}
