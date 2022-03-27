package stack;

public class MaxStack {
   private Stack<Integer> stack=new Stack<>();
   private Stack<Integer> maxStack=new Stack<>();

    public void push(int val){
        int max=val;
        if(!maxStack.isEmpty() && maxStack.peek()>max){
            max=maxStack.peek();
        }
        stack.push(val);
        maxStack.push(max);
    }
    public void pop(){
        stack.pop();
        maxStack.pop();
    }
    public int max(){
        if(maxStack.isEmpty()){
            return -1;
        }
        return maxStack.peek();
    }
}
