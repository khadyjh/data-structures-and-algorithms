/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge30;

import challenge30.structure.HashMap;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }

    @Test
    @DisplayName("Setting a key/value to your hashtable results in the value being in the data structure")
    public void test1(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("key","value");
        hashMap.put("key1","value1");

        assertFalse(hashMap.isEmpty());

    }

    @Test
    @DisplayName("Retrieving based on a key returns the value stored")
    public void test2(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("key","value");
        hashMap.put("key1","value1");

        String key=hashMap.get("key");
        assertEquals(key,hashMap.get("key"));

    }

    @Test
    @DisplayName("Successfully returns null for a key that does not exist in the hashtable")
    public void test3(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("key","value");
        hashMap.put("key1","value1");

        assertNull(hashMap.get("name"));

    }

    @Test
    @DisplayName("Successfully returns a list of all unique keys that exist in the hashtable")
    public void test4(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("key","value");
        hashMap.put("key1","value1");

        String[] keys={"key1","key"};
        String[] result= hashMap.Keys().toArray(new String[0]);
        assertArrayEquals(keys,result);

    }

    @Test
    @DisplayName("Successfully handle a collision within the hashtable")
    public void test5(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("JAVA", "JAVA"); // at index 0
        hashMap.put("Amman", "Amman"); // at index 0
        assertFalse(hashMap.isEmpty());

    }

    @Test
    @DisplayName("Successfully retrieve a value from a bucket within the hashtable that has a collision")
    public void test6(){
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("JAVA", "JAVA"); // at index 0
        hashMap.put("Amman", "Amman"); // at index 0
       assertEquals("JAVA",hashMap.get("JAVA"));
       assertEquals("Amman",hashMap.get("Amman"));

    }

    @Test
    @DisplayName("Successfully hash a key to an in-range value")
    public void test7(){
        // array size 0-9
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("JAVA", "JAVA"); // at index 0
        hashMap.put("Amman", "Amman"); // at index 0

      int hashedIndex=hashMap.getBucketIndex("JAVA");
      int hashedIndex1=hashMap.getBucketIndex("Amman");

      assertTrue(hashedIndex>=0 && hashedIndex<10);
      assertTrue(hashedIndex1>=0 && hashedIndex1<10);

    }

}
