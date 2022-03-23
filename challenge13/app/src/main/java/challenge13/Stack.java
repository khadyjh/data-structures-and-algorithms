package challenge13;


import java.util.EmptyStackException;

public class Stack<T> {
    private Node<T> top;

    public Node<T> getTop() {
        return top;
    }



    public Stack(){
        this.top=null;
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(T val){
        Node<T> newNode=new Node<>(val);
        if(isEmpty()){
            top=newNode;
        }else {
            newNode.setNext(top);
            top=newNode;
        }
    }

    public T pop(){
        Node<T> temp;
        if(isEmpty()){
            throw new EmptyStackException();
        }else {
            temp=top;
            top=top.getNext();
        }
        return temp.getValue();
    }

    public T peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return top.getValue();
    }

    @Override
    public String toString() {
        return "Stack{" +
                "top=" + top +
                '}';
    }
}
