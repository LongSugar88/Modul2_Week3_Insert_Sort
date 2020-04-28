import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Insertion_SortTest {
    Insertion_Sort<Integer>  insertionSort = new Insertion_Sort<>();
    @BeforeEach
    void setup(){
        insertionSort = new Insertion_Sort<>();
    }

    @Test
    void sort() {
        Integer[] myArray = {5,7,4,5,2,9,0,1,3};
        Integer[] expect = {0,1,2,3,4,5,5,7,9};
        Integer[] result = insertionSort.sort(myArray);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort1() {
        Integer[] myArray = {7,9,6,4,0,8,2,3,5,1};
        Integer[] expect = {0,1,2,3,4,5,6,7,8,9};
        Integer[] result = insertionSort.sort(myArray);
        Assert.assertArrayEquals(expect, result);
    }
    @Test
    void sort2() {
        Integer[] myArray1 = {2,0,4,6,8,7,3,1,5};
        Integer[] expect = {0,1,2,3,4,5,6,7,8};
        Integer[] result = insertionSort.sort(myArray1);
        Assert.assertArrayEquals(expect, result);
    }
}