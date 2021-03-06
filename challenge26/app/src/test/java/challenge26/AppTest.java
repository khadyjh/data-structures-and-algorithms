/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package challenge26;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Array;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    ///////////////////////////////////////////challenge 26 ///////////////////////////////////////////
  @Test
  @DisplayName(" insertionSort test normal")
  void test1(){

      int[] arr={8,4,23,42,16,15};
      App.insertionSort(arr);

      int[] exp={4,8,15,16,23,42};
      assertEquals(Arrays.toString(exp),Arrays.toString(arr));


  }

    @Test
    @DisplayName("insertionSort test empty array")
    void test2(){

        int[] arr={};
        App.insertionSort(arr);

        int[] exp={};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }



    ///////////////////////////////////////////challenge 27 ///////////////////////////////////////////

    @Test
    @DisplayName(" margeSort test empty array")
    void test21(){

        int[] arr={};
        App.mergeSort(arr);

        int[] exp={};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }


    @Test
    @DisplayName(" margeSort test Reverse-sorted array")
    void test22(){

        int[] arr={20,18,12,8,5,-2};
        App.mergeSort(arr);

        int[] exp={-2,5,8,12,18,20};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }

    @Test
    @DisplayName(" margeSort test Few uniques array")
    void test23(){

        int[] arr={5,12,7,5,5,7};
        App.mergeSort(arr);

        int[] exp={5,5,5,7,7,12};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }

    ///////////////////////////////////////////challenge 28 ///////////////////////////////////////////

    @Test
    @DisplayName(" margeSort test empty array")
    void test31(){

        int[] arr={};
        App.quickSort(arr,0,arr.length-1);

        int[] exp={};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }


    @Test
    @DisplayName(" margeSort test Reverse-sorted array")
    void test32(){

        int[] arr={20,18,12,8,5,-2};
        App.quickSort(arr,0,arr.length-1);

        int[] exp={-2,5,8,12,18,20};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }

    @Test
    @DisplayName(" margeSort test Few uniques array")
    void test33(){

        int[] arr={5,12,7,5,5,7};
        App.quickSort(arr,0,arr.length-1);

        int[] exp={5,5,5,7,7,12};
        assertEquals(Arrays.toString(exp),Arrays.toString(arr));


    }
}
