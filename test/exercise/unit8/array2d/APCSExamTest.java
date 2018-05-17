package exercise.unit8.array2d;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by autocarhung on 2018/5/17.
 */
class APCSExamTest {
    private static boolean arraysEqual(int[][] one, int[][] two) {
        if(one.length != two.length)
            return false;

        for(int r = 0; r < one.length; r++) {
            if(!Arrays.equals(one[r],two[r]))
                return false;
        }
        return true;
    }
    @Test
    void testRowSwap() {
        int[][] mat = new int[][]{
                {10,9,8,7},
                {6,5,4,3},
                {2,1,-1,0}
        };

        int[][] expectedResult = new int[][]{
                {10,9,8,7},
                {2,1,-1,0},
                {6,5,4,3}
        };

        int rowAIndex = 1, rowBIndex =2;
        APCSExam.rowSwap(mat,rowAIndex,rowBIndex);
        assertTrue(arraysEqual(mat,expectedResult));
//        assertArrayEquals(expectedResult,mat);
    }
}