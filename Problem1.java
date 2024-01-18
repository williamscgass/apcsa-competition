public class Problem1{
    public static void main(String[] args) {

        int[][] mat1 = {
            {1, 2, 3, 4, 5},
            {6, 7, 8, 9, 5},
            {11, 7, 13, 14, 5},
            {16, 17, 13, 19, 5},
            {21, 22, 13, 24, 5},
        };

        printDuplicates(mat1);

        int[][] mat2 = {
            {1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3}, 
            {4, 4, 4, 4, 4},
            {1, 2, 3, 4, 5},
        };

        printDuplicates(mat2);
    }

    /**
     * Prints all duplicates in the 2d array mat.
     * Prints should be in the form:
     * "<element>: <number of times element is in mat>\n"
     * If an element has no duplicates, it should not have a print statement.
     * Redundant prints are okay (i.e. printing the same thing more than once). BUT -- if you remove redundant prints, you get +0.25 points.
     * You may create other methods to help you
     */
    public static void printDuplicates(int[][] mat) {
        /**
         * Your code goes here...
         */
    }
}