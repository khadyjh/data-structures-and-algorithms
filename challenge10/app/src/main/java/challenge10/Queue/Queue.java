package challenge10.Queue;

import challenge10.Node;

import java.util.NoSuchElementException;

public class Queue<T> {

    private static final int QUEUE_SIZE = 10;

    private Node<T> front;
    private Node<T> rear;
    private int size;

    public Queue() {
        size=0;
    }

    public void enqueue(T val){
        Node<T> newNode=new Node<>(val);
        if(isEmpty()){
            front=newNode;
            rear=newNode;
            size++;
        }else if(size< QUEUE_SIZE){
//            newNode.setNext(rear);
//            rear=newNode;
            rear.setNext(newNode);
            rear=newNode;
            size++;
        }
   }

   public T dequeue(){
        Node<T> temp;
        if(isEmpty()){
            throw new NoSuchElementException("Empty Queue ");
        }else {
            temp=front;
            front=front.getNext();
            size--;
        }
        return temp.getValue();
   }

   public T peek(){
        if(isEmpty()){
            throw new NoSuchElementException("Empty Queue");
        }
        return front.getValue();
   }

   public boolean isEmpty(){
       return size==0;
   }

    @Override
    public String toString() {
        return "Queue{" +
                "front=" + front +
                ", rear=" + rear +
                ", size=" + size +
                '}';
    }
}
