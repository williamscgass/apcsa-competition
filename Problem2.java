public class Problem2 {
    public static void main(String[] args) {

        int[][] mat1 = {
            {1, 2, 3, 4, 5},
            {6, 7, 99, 9, 5},
            {11, 7, 13, 14, 5},
            {16, 17, 13, 19, 5},
            {21, 22, 13, 24, 5},
        };
        printHighestTwo(mat1);

        int[][] mat2 = {
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 30, 3}, 
            {4, 77, 4, 4, 4},
            {1, 2, 3, 4, 5},
        };

        printHighestTwo(mat2);
    }

    /**
     * Prints the largest two elements in mat in the format
     * "<largest element>, <second largest element>"
     */
    public static void printHighestTwo(int[][] mat) {
    }
}
