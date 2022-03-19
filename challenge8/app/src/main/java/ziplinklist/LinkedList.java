package ziplinklist;

import java.util.ArrayList;
import java.util.List;

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

    public T KthFromEnd(int k){
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

    public LinkedList<T> zipLists(LinkedList<T> one,LinkedList<T> two){
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

    public LinkedList<T> reverse(LinkedList<T> linkedList){

        Node<T> pointer=linkedList.head;
        Node<T> next=linkedList.head;
        Node<T> pre=null;
        int counter=0;
        while (pointer!=null){
            next=next.next;
            pointer.next=pre;
            pre=pointer;
            pointer=next;
            if(counter!=0){
                linkedList.insert(pre.value);
            }
            counter++;
        }

        System.out.println(linkedList);
        return linkedList;
    }

    public boolean palindrome(LinkedList<T> linkedList){
        if(linkedList.size()==1 || linkedList.size()==0){
            return false;
        }
        List<Object> alpha=new ArrayList<>();
        Node<T> pointer=linkedList.head;
        while (pointer!=null){
            alpha.add(pointer.value);
            pointer=pointer.next;
        }
        int sizeOfArray= alpha.size()-1;
        int count=0;
        for (int index = 0; index < alpha.size(); index++) {
            if(alpha.get(index)==alpha.get(sizeOfArray)){
                count++;
                sizeOfArray--;
            }
        }
        if(count== alpha.size()){
            return true;
        }
        return false;
    }

    public boolean palindrome1(LinkedList<T> linkedList){
//        List<Object> alpha=new ArrayList<>();
//        Node<T> pointer=linkedList.head;
//        while (pointer!=null){
//            alpha.add(pointer.value);
//            pointer=pointer.next;
//        }


//        for (int index = 0; index < alpha.size()/2; index++) {
//
//        }
//        Node<T> pointer1=linkedList.reverse(linkedList).head;
//        while (pointer!=null && pointer1!=null){
//
//            pointer=pointer.next;
//            pointer1=pointer1.next;
//        }
//


        //find middle
        Node<T> slowPointer, fastPointer;
        slowPointer = fastPointer = linkedList.head;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        Node middle=slowPointer;
        Node secondNode =middle.next;
        middle=null;
        Node pointer=linkedList.head;
        Node pointer1=linkedList.reverse(linkedList).head;

        int count=0;
        while (pointer!=null && pointer1!=null){
            if(pointer.value==pointer1.value) {
                count++;
            }



        }

        return true;

    }

    public  Node<T> findMiddleNode(LinkedList<T> head)
    {
        // step 1
        Node<T> slowPointer, fastPointer;
        slowPointer = fastPointer = head.head;

        while(fastPointer !=null) {
            fastPointer = fastPointer.next;
            if(fastPointer != null && fastPointer.next != null) {
                slowPointer = slowPointer.next;
                fastPointer = fastPointer.next;
            }
        }

        return slowPointer;
    }

   public T printMiddle(LinkedList<T> linkedList)
    {
        int count = 0;
        Node<T> mid = linkedList.head;
        Node<T> pointer =linkedList.head;

        while (pointer != null)
        {

            // Update mid, when 'count'
            // is odd number
            if ((count % 2) == 1)
                mid = mid.next;

            ++count;
            pointer = pointer.next;
        }

        // If empty list is provided
//        if (mid != null)
//            System.out.println("The middle element is [" +
//                    mid.value + "]\n");

        System.out.println(count);
        assert mid != null;
        return mid.value;
    }

    public void  reverseSinglyLinkedList(){
        Node pointer =this.head;
        Node previous =null;
        Node value;
        while (pointer!= null){
            value=pointer;
            pointer=pointer.next;
            value.next=previous;
            previous=value;
            head=value;
        }
    }

//    public void isPalindromeLL() {
//        Node current = head;
//        boolean flag = true;
//        int size;
//
//        //Store the mid position of the list
//        int mid = (size % 2 == 0) ? (size / 2) : ((size + 1) / 2);
//
//        //Finds the middle node in given singly linked list
//        for (int i = 1; i < mid; i++) {
//            current = current.next;
//        }
//    }

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