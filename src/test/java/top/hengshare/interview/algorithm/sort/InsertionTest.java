package top.hengshare.interview.algorithm.sort;

import org.junit.Test;

import java.util.Arrays;

public class InsertionTest {
    private int[] arr = {1, 3, 5, 2, 11, 23, 34, 31, 12, 11};

    @Test
    public void testSort() {
        Insertion insertion = new Insertion();
        insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}