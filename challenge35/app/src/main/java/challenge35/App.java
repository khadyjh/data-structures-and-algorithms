/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge35;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Graph graph=new Graph();
        System.out.println(graph.addNode("A"));
        graph.addNode("B");
        graph.addNode("C");
        graph.addNode("D");


        graph.addEdgeWeight("A","B",5);
        graph.addEdge("A","B");
        graph.addEdgeWeight("A","D",6);
        graph.addEdge("A","D");
        graph.addEdgeWeight("D","C",4);
        graph.addEdge("D","C");
        graph.addEdgeWeight("B","C",3);
        graph.addEdge("B","C");

        String[] arr={"A","B","C"};
        System.out.println(graph.businessTrip(graph,arr));
    }
}
