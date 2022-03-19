package challenge10.Queue;

import challenge10.Node;
import challenge10.stack.Stack;

import java.util.EmptyStackException;

public class PseudoQueue<T> {

   private Stack<T> stack;
   private Stack<T> stack1;

    public PseudoQueue() {
        stack=new Stack<>();
        stack1=new Stack<>();
    }

    public void enqueue(T val){
        while (!stack.isEmpty()){
            stack1.push(stack.pop());
        }
        stack.push(val);

        while (!stack1.isEmpty()){
            stack.push(stack1.pop());
        }
    }

    public T dequeue(){
        if(stack.isEmpty()){
            throw new EmptyStackException();
        }
        return stack.pop();
    }

    @Override
    public String toString() {
        Node<T> pointer=stack.getTop();
        String str="";
        while (pointer!=null){
            str= str + "{" +pointer.getValue() +
                    "} <- ";
            pointer=pointer.getNext();

        }
        return " front "+str+" rear ";
    }

}
