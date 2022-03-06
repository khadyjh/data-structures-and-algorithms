/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge6;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    @DisplayName("Can successfully add a node to the end of the linked list")
    void appendTest(){
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.insert(5);
        //add node to the end of linked list
        linkedList.append(6);

        String exp=" {5} ->{6} ->NULL";
        String result=linkedList.toString();

        assertEquals(exp,result);
    }

    @Test
    @DisplayName("Can successfully add multiple nodes to the end of a linked list")
    void appendMultiTest(){
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.insert(5);
        //add Multi node to the end of linked list
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);

        String exp=" {5} ->{6} ->{7} ->{8} ->NULL";
        String result=linkedList.toString();

        assertEquals(exp,result);
    }

    @Test
    @DisplayName("Can successfully insert a node before a node located i the middle of a linked list")
    void addBeforeTest(){
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.insert(5);
        //add Multi node to the end of linked list
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        // insert node before another node
        linkedList.insertBefore(10,7);

        String exp=" {5} ->{6} ->{10} ->{7} ->{8} ->NULL";
        String result=linkedList.toString();

        assertEquals(exp,result);
    }

    @Test
    @DisplayName("Can successfully insert a node before the first node of a linked list")
    void addBeforeFirstTest(){
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.insert(5);
        //add Multi node to the end of linked list
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        // insert node before another node
        linkedList.insertBefore(10,7);
        linkedList.insertBefore(100,5);

        String exp=" {100} ->{5} ->{6} ->{10} ->{7} ->{8} ->NULL";
        String result=linkedList.toString();

        assertEquals(exp,result);
    }

    @Test
    @DisplayName("Can successfully insert after a node in the middle of the linked list")
    void addAfterTest(){
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.insert(5);
        //add Multi node to the end of linked list
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        // insert node before another node
        linkedList.insertBefore(10,7);
        linkedList.insertBefore(100,5);
        //
        linkedList.InsertAfter(111,10);

        String exp=" {100} ->{5} ->{6} ->{10} ->{111} ->{7} ->{8} ->NULL";
        String result=linkedList.toString();

        assertEquals(exp,result);
    }
    @Test
    @DisplayName("Can successfully insert a node after the last node of the linked list\n")
    void addAfterLastTest(){
        LinkedList<Integer>linkedList=new LinkedList<>();
        linkedList.insert(5);
        //add Multi node to the end of linked list
        linkedList.append(6);
        linkedList.append(7);
        linkedList.append(8);
        // insert node before another node
        linkedList.insertBefore(10,7);
        // insert node before first node
        linkedList.insertBefore(100,5);
        //insert node after another node
        linkedList.InsertAfter(111,10);
        //insert node after last node
        linkedList.InsertAfter(110,8);


        String exp=" {100} ->{5} ->{6} ->{10} ->{111} ->{7} ->{8} ->{110} ->NULL";
        String result=linkedList.toString();

        assertEquals(exp,result);
    }

}
