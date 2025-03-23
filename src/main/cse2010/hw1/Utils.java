package cse2010.hw1;

public class Utils {

    /**
     * Find an index of an element matching `target`.
     * @param xs int array
     * @param target element to be found
     * @return index of a matching element, -1 otherwise
     */
    public static int findIndex(int[] xs, int target) {
        // 하나씩 훑으면서찾고, 있으면 index 없으면 -1 리턴 
        int temp;
        int result = -1;
        for (int i =0;i<= xs.length;i++) {
            temp = xs[i];
            if (temp == target) {
                result = i;
            }
        }
        return result;
    }

    /**
     * Calculate the sum of an array.
     * @param xs double array
     * @return sum of an array
     */
    public static double sum(double[] xs) {

        return 0.0;
    }

    /**
     * Reverse the elements of a String array. For example, ["A", "BB", "C"] => ["C", "BB", "A"]
     * @param xs String array
     * @return a newly created array containing elements of xs in reversed order
     */
    public static String[] reverse(String[] xs) {

        return null;
    }

    /**
     * Swap elements at position i and j in array xs
     * @param xs integer array
     * @param i index of element to be swapped
     * @param j index of element to be swapped
     */
    public static void swap(int[] xs, int i, int j) {
        int temp;
        // i = 8 j = 3
        temp = xs[i]; // temp = 8
        xs[i] = xs[j]; // i = 3, j =3 
        xs[j] = temp; // i = 3, j = 8

        
        
    }

    /**
     * Reverse the elements of a String array in place without creating a new array.
     * Input array xs itself must be transformed to an array containing elements
     * in reversed order.
     * For example, ["A", "BB", "C"] => ["C", "BB", "A"].
     * @param xs String array
     */
    public static void reverse_in_place(String[] xs) {

    }

    /**
     * Returns an array containing running averages of an array.
     * @param xs int array
     * @return an array containing running average
     *
     * Given an input xs = [1, 2, 3, 4], `average()` returns a new array
     * containing running averages [1.0, 1.5, 2.0, 2.5].
     * Here,
     *      1.0 = 1 / 1
     *      1.5 = (1 + 2) / 2
     *      2.0 = (1 + 2 + 3) / 3
     *      2.5 = (1 + 2 + 3 + 4) / 4
     */
    public static double[] average(int[] xs) {

        return null;
    }

}
