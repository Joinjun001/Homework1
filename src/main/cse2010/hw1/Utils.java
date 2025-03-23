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
        for (int i =0;i< xs.length;i++) {
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
        // result 하나 만들고 차곡차곡 쌓으면 될듯
        double result = 0;

        for (int i = 0; i < xs.length; i++) {
            result += xs[i];
        } 
        return result;
    }

    /**
     * Reverse the elements of a String array. For example, ["A", "BB", "C"] => ["C", "BB", "A"]
     * @param xs String array
     * @return a newly created array containing elements of xs in reversed order
     */
    public static String[] reverse(String[] xs) {
        // 새로운 배열을 만든다음, 마지막인덱스부터 저장하면될듯? 
        String[] result = new String[xs.length];
        for (int i = 0; i < xs.length; i++) {
            result[xs.length - i - 1] = xs[i];
        }
        
        return result;
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
        // 이건 어케함?? 새로운 배열을 만들지 않고 안에서 돌려야된다.
        // 아까 구현한 swap을 사용해도 될거같긴한데, string 전용함수라 직접 만들어야겟다.
        // for문은 배열의 개수에 따라 중간까지만 가면 되므로 xs.length / 2를 해주면될거같다.
        
        for (int i = 0; i < xs.length / 2; i++) {
            String temp; 
            int j = xs.length - i -1;
            temp = xs[i]; // temp = "A"
            xs[i] = xs[j]; // i = "C" j= "C"
            xs[j] = temp; // i = "C" j = "A"
        }
        
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
        
        double[] result = new double[xs.length];
        // 이중 반복문을 써야되나??
        for (int i = 0; i < xs.length; i++) {
            double temp = 0;
            for(int j = 0; j <= i; j++) {
                temp += xs[j];
            }
            result[i] = temp / (i + 1);
        }

        return result;
    }

}
