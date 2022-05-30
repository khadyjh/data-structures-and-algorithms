package challenge35;

import java.util.*;

public class Graph{

    private final Map<Vertex , List<Vertex>> list;
    private final Map<Vertex , List<Edge>> list2;

    public Graph() {
        list=new HashMap<>();

        // weighted
        list2=new HashMap<>();
    }

    public Vertex addNode(String val){
        Vertex vertex=new Vertex(val);
        list.putIfAbsent(vertex,new ArrayList<>());

        // for weighed graph
        list2.putIfAbsent(vertex,new ArrayList<>());
        return vertex;
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



    ///////////////////////////////////////////////////////////challenge 36 //////////////////////////////////////////

    public Set<String> breadthFirst(String root){
        List<Vertex> nods=getNods();
        Vertex node=new Vertex(root);
        if(!nods.contains(node)){
            return null;
        }
        Set<String> visited = new LinkedHashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.add(root);
        visited.add(root);
        while (!queue.isEmpty()){
            String vertex = queue.poll();
            List<Vertex> neighbors=getNeighbors(vertex);
            if(neighbors!=null){
                for(Vertex v : neighbors){
                    if(!visited.contains((v.getValue())))
                    {
                        if(!queue.contains(v.getValue())){
                            queue.add(v.getValue());
                        }
                    }
                }
            }
            visited.add(vertex);
        }
        return visited;
    }

    ///////////////////////////////////////////////////////////challenge 37 //////////////////////////////////////////

    public int businessTrip(Graph graph, String[] cityName){
        int cost=0;
        for (int i = 0; i < cityName.length; i++) {
            if(i+2>cityName.length){
                break;
            }
            List<Vertex> neighbors=graph.getNeighbors(cityName[i]);
            if(neighbors.contains(new Vertex(cityName[i+1]))){
                List<Edge> edges=graph.getWeightedNeighbors(cityName[i]);
                for (int j = 0; j < edges.size(); j++) {
                    if(new Vertex(cityName[i+1]).equals(graph.getNeighbors(cityName[i]).get(j))){
                        cost=cost+edges.get(i).getWeight();
                    }
                }
            }else {
                return 0;
            }
        }
        return cost;
    }
}
