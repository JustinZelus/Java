package exercise.unit8.array2d;

/**
 * Created by autocarhung on 2018/5/17.
 */
public class APCSExam {

    /**
     * Swaps all values in the specified 2 rows of mat.
     * @param mat the array
     * @param rowAIndex the index of a row to be swapped
     * @param rowBIndex the index of a row to be swapped
     */
    public static void rowSwap(int[][] mat, int rowAIndex, int rowBIndex)
    {
        int[] temp = mat[rowAIndex];
        mat[rowAIndex] = mat[rowBIndex];
        mat[rowBIndex] = temp;
    }
}
