/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedList;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    void linkedListTestIncludeTrue(){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        boolean result=linkedList.includes(2);
        assertEquals(true,result);
    }

    @Test
    void linkedListTestIncludeFalse(){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);
        boolean result=linkedList.includes(3);
        assertEquals(false,result);
    }

    @Test
    void linkedListTestAddFirst(){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1);
//        linkedList.addFirst(2);

        Node node=new Node<>(1);
        Node pointer=linkedList.head;

        System.out.println(pointer.value);
        assertEquals(1,pointer.value);
    }

    @Test
    void linkedListTestPrint(){
        LinkedList<Integer> linkedList=new LinkedList<>();
        linkedList.addFirst(1);
        linkedList.addFirst(2);

        assertEquals(" {2} ->{1} ->NULL",linkedList.toString());
    }

    @Test
    void linkedListTestEmpty(){
        LinkedList<Integer> linkedList=new LinkedList<>();
        assertEquals(" NULL",linkedList.toString());
    }



}
