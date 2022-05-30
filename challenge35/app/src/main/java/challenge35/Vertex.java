package challenge35;

import java.util.Objects;

public class Vertex {

    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Vertex(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Vertex{" +
                 value +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vertex vertex = (Vertex) o;
        return Objects.equals(value, vertex.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
