/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        System.out.println(new App().getGreeting());

        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        System.out.println(linkedList.includes(100));
//        linkedList.addFirst(2);
        linkedList.print();
        System.out.println(linkedList.toString());

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");

        LinkedList<String> str=new LinkedList<>();

        str.addFirst("education");
        str.addFirst("name");
        System.out.println(str.includes("name"));
        str.print();
        System.out.println(str.toString());
//        str.printAllItems();
    }
}