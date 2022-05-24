package challenge35;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph{

    private final Map<Vertex , List<Vertex>> list;
    private final Map<Vertex , List<Edge>> list2;

    public Graph() {
        list=new HashMap<>();
        list2=new HashMap<>();
    }

    public void addNode(String val){
        Vertex vertex=new Vertex(val);
        list.putIfAbsent(vertex,new ArrayList<>());

        // for weighed graph
        list2.putIfAbsent(vertex,new ArrayList<>());
    }

    ///////////////////////////////////////////////////////  graph /////////////////////////////////
    public void addEdge(String val , String val2){
        Vertex vertex = new Vertex(val);
        Vertex vertex1 = new Vertex(val2);

        if(list.containsKey(vertex) && list.containsKey(vertex1)){
            list.get(vertex).add(vertex1 );
            list.get(vertex1).add(vertex);
        }else {
            throw new IllegalArgumentException();
        }
    }

    public List<Vertex> getNods(){
        List<Vertex> allNods=new ArrayList<>();
        for (Vertex v :
                list.keySet()) {
            allNods.add(v);
        }
        return allNods;
    }

    public List<Vertex> getNeighbors(String val){
        Vertex vertex=new Vertex(val);
        return list.get(vertex);
    }

    public int size(){
        return list.size();

    }


    public String toStringSimpleGraph() {
       StringBuilder str=new StringBuilder();
        for (Vertex v : list.keySet()) {
            str.append("<<");
            str.append(v.toString());
            str.append("=>");
            str.append(list.get(v).toString());
            str.append(">>");
        }
        return str.toString();
    }

    /////////////////////////////////////////////////////// weighted graph /////////////////////////////////


    public void addEdgeWeight(String val1, String val2, int weight){
        Edge edge=new Edge(val1,val2,weight);

        Vertex vertex=new Vertex(val1);
        Vertex vertex1=new Vertex(val2);

        list2.get(vertex).add(edge);
        list2.get(vertex1).add(edge);

    }

    public List<Edge> getWeightedNeighbors(String val){
        Vertex vertex=new Vertex(val);
        return list2.get(vertex);
    }

    public String toStringWeighted() {
        StringBuilder str=new StringBuilder();
        for (Vertex v : list2.keySet()) {
            str.append("<<");
            str.append(v.toString());
            str.append("=>");
            str.append(list2.get(v).toString());
            str.append(">>");
        }
        return str.toString();
    }
}
