/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge6;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());



//        LinkedList<Integer> linkedList=new LinkedList<>();
//        linkedList.insert(1);
//        linkedList.insert(2);
//        System.out.println(linkedList.includes(100));
//        linkedList.print();
//        linkedList.insert(55);
//        linkedList.append(12);
//        linkedList.append(11);
//        linkedList.InsertAfter(6,55);
//        linkedList.insertBefore(100,11);
//        linkedList.InsertAfter(100,11);
//        System.out.println(linkedList.toString());

        System.out.println("///////////////////////////////////////////////////////////////////////////////////////////");

        LinkedList<String> str=new LinkedList<>();
        str.append("why");
        str.append("are");
        str.append("you");
        str.append("here");
        str.append("?");
        System.out.println(str);
    }
}
