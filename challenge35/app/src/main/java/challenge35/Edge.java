package challenge35;

public class Edge {
    private String start;
    private String end;
    private int weight;

    public Edge(String start, String end, int weight) {
        this.start = start;
        this.end = end;
        this.weight = weight;
    }

    public Edge(String start) {
       this.start=start;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", weight=" + weight +
                '}';
    }
}
