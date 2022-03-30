package challenge15.data;

public class BinaryNode<T extends Comparable<T>> extends Node<T> {
    public BinaryNode(T data) {
        super(data);
    }

    @Override
    public int compareTo(Node<T> o) {
        return 0;
    }
}