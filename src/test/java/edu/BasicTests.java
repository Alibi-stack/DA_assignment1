
package edu;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Arrays;

public class BasicTests {
    @Test
    public void mergeSortSorts(){
        int[] a = Utils.randomArray(1000, 1);
        MergeSortSimple.sort(a);
        assertTrue(Utils.isSorted(a));
    }
    @Test
    public void quickSortSorts(){
        int[] a = Utils.randomArray(1000, 2);
        QuickSortSimple.sort(a, 2L);
        assertTrue(Utils.isSorted(a));
    }
    @Test
    public void quickSelectMatchesSort(){
        int[] a = Utils.randomArray(500, 3);
        int k = 123;
        int v = QuickSelect.select(a.clone(), k, 3L);
        int[] b = a.clone();
        Arrays.sort(b);
        assertEquals(b[k], v);
    }
}
