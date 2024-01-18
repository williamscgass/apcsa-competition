public class Problem3 {
    public static void main(String[] args) {

        int[][] mat1 = {
            {1, 2, 3, 4, 5},
            {6, 7, 99, 9, 5},
        };
        printDiagonals(mat1, 2, 5);

        int[][] mat2 = {
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4},
            {5, 5, 5, 5, 5},
            {6, 6, 6, 6, 6},
            {7, 7, 7, 7, 7},
        };

        printDiagonals(mat2, 7, 5);
    }

    /**
     * Prints the diagonals of the matrix.
     * for example:
     *  1 1 1 1
     *  2 2 2 2
     *  3 3 3 3
     * would print:
     * "3"
     * "2 3"
     * "1 2 3"
     * "1 2 3"
     * "1 2"
     * "1"
     * 
     * 
     * and
     * 1 1
     * 2 2
     * 3 3
     * 4 4
     * would print:
     * "4"
     * "3 4"
     * "2 3"
     * "1 2"
     * "1"
     */
    public static void printDiagonals(int[][] mat, int numRows, int numCols) {
        
    }
}
