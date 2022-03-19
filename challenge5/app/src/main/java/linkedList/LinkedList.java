package linkedList;

public class LinkedList<T> {

    Node<T> head;

    public LinkedList(){

        this.head=null;
    }

    public void insert(T val){
        Node newNode=new Node(val);
        newNode.next=this.head;
        this.head=newNode;

    }

    public boolean includes(T val){
        Node pointer=this.head;
        while (pointer != null){
            if(pointer.value == val){
                return true;
            }
            pointer=pointer.next;
        }


        return false;
    }

    public String toString(){
        String str=" ";
        Node pointer=this.head;
        while (pointer!=null){
            str= str +"{"+ pointer.value +"} ->";
            pointer=pointer.next;
        }
        str=str + "NULL";
        return str;
    }

    public void print(){

        System.out.println("Linked List ==> " +toString() );
    }

}
