/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

import challenge30.structure.HashMap;

import java.util.List;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println("Welcome to Hash Tables Class");

        HashMap<String, String> hashMap = new HashMap<>();
        hashMap.put("JAVA", "JAVA");
        hashMap.put("Amman", "Amman");
        hashMap.put("Jordan", "Jordan");
//        hashMap.put("J", "J");
        hashMap.put("Bob", "Bob");
        hashMap.put("Carl", "Carl");
//        hashMap.put("Bob", "Carl");
        hashMap.put("Italy", "Italy");

        System.out.println(hashMap.get("JAVA"));
        System.out.println("**********************************************************");
        System.out.println(hashMap.contains("Java"));
        System.out.println("**********************************************************");

        hashMap.Keys();


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        java.util.HashMap<String,String> test=new java.util.HashMap<>();
        test.put("key","value");
        System.out.println(test);

    }
}
