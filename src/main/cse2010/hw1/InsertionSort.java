package cse2010.hw1;

public class InsertionSort {

    /**
     * Sort an array xs in a non-increasing (i.e., decreasing) order
     * @param xs integer array
     */
    // DO NOT MODIFY THIS METHOD!!
    public static void isort(int[] xs) {
        for (int i = 1; i < xs.length; i++) {
            insert(xs, i);
        }
    }

    /**
     * Insert element xs[k] to already sorted group x[0]..x[k-1]
     * @param xs integer array
     * @param k index of element to be inserted
     */
    private static void insert(int[] xs, int k) {
        // swap 사용해서 insertionSort 구현하기 
        for (int i = 1; i < xs.length; i++) {
            for (int j = i; j > 0; j--) {
                if(xs[j] > xs[j-1]) { // 뒤에게 앞에거보다 작으면 옮겨야됨
                    Utils.swap(xs, j-1, j);
                }
            }
        }

    }

}
