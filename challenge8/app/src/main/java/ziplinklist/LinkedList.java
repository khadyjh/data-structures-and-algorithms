package ziplinklist;

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


    public LinkedList<T>  zipLists(LinkedList<T> one,LinkedList<T> two){
        Node<T> pointer1=one.head;
        Node<T> pointer2=two.head;
        Node<T> oneNext;
        Node<T> twoNext;

        if(one.size()==0)
        {
            return two;
        }else if(two.size()==0){
            return one;
        }else if(one.size()==0 && two.size()==0){
            return null;
        }else if(one.size()==1 && two.size()==1){
            one.head.next=two.head;
            return one;
        } else {
            while (pointer1.next!=null && pointer2.next!=null){
                oneNext=pointer1.next;
                twoNext=pointer2.next;

                pointer1.next=pointer2;
                pointer2.next=oneNext;

                pointer1=oneNext;
                pointer2=twoNext;

//                if(pointer1.next==null){
//                    pointer1.next=pointer2;
//                }

            }

            if(pointer2.next==null){
                pointer2.next=pointer1.next;
                pointer1.next=pointer2;
            }
            if (pointer1.next==null){
                pointer1.next=pointer2;
            }
        }

        two.head=null;
//        System.out.println(two);
        return one;
    }


    public String toString(){
        StringBuilder str= new StringBuilder(" ");
        Node<T> pointer=this.head;
        while (pointer!=null){
            str.append("{").append(pointer.value).append("} ->");
            pointer=pointer.next;
        }
        str.append("NULL");
        return str.toString();
    }

    public void print(){

        System.out.println("Linked List ==> " +toString() );
    }

}