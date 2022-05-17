package challenge18;

public class BinaryNode<T extends Comparable<T>> extends Node<T> {
    public BinaryNode(T data) {
        super(data);
    }


    @Override
    public int compareTo(T o) {
        return super.compareTo(o);
    }
}