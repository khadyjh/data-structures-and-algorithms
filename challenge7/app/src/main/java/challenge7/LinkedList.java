package challenge7;

public class LinkedList<T> {

    Node<T> head;

    public LinkedList(){

        this.head=null;
    }

    public void insert(T val){
        Node<T> newNode=new Node<>(val);
        newNode.next=this.head;
        this.head=newNode;

    }

    public void InsertAfter(T valInsert,T valAfter){
        Node<T> pointer=this.head;
// 1 2 3
        while (pointer!=null){
            if(pointer.value == valAfter){
                Node<T> newNode=new Node<>(valInsert);
                newNode.next=pointer.next;
                pointer.next=newNode;
                break;
            }

            pointer=pointer.next;
        }

    }

    public void insertBefore(T valInsert,T valBefore){
        Node<T> pointer=this.head;
        if(pointer.value==valBefore){
            insert(valInsert);
        }
        while (pointer.next!=null){
            if(pointer.next.value == valBefore){
                Node<T> newNode=new Node<>(valInsert);
                newNode.next=pointer.next;
                pointer.next=newNode;
                break;
            }

            pointer=pointer.next;
        }
    }

    public void append(T val) {
        Node<T> pointer = this.head;
        while (pointer != null) {
            if (pointer.next == null) {
                Node<T> newNode = new Node<>(val);
                pointer.next = newNode;
                newNode.next = null;
                break;
            }
            pointer = pointer.next;
        }
    }

    public void delete(T val){
        Node<T> pointer=this.head;
        while (pointer!=null){
            if(pointer.next.value==val){
                pointer.next=pointer.next.next;

                break;
            }
            pointer=pointer.next;
        }

    }

    public boolean includes(T val){
        Node<T> pointer=this.head;
        while (pointer != null){
            if(pointer.value == val){
                return true;
            }
            pointer=pointer.next;
        }


        return false;
    }

    public int size(){
        int counter=0;
        Node<T> pointer=this.head;
        while (pointer!=null){
            counter++;
            pointer=pointer.next;
        }
        return counter;

    }

    public T KthFromEnd(int k)  {
        int count= size()-1;
        Node<T> pointer=this.head;

            if(k>count ){
                System.out.println("the index out of bound ");
            }else {
                while (pointer!=null){
                    if(count==k) {
                        return pointer.value;
                    }
                    pointer=pointer.next;
                    count--;
                }
            }


        throw new IllegalArgumentException();
    }

    public String toString(){
        String str=" ";
        Node<T> pointer=this.head;
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