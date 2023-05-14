public class betterBubleSort2 {
    public static int[] fastSort(int[] arr) {
        int temp;
        boolean isSorted = false;
        while (!isSorted) { // while array is not sorted
            isSorted = true;
            for(int i = 1; i < arr.length; i++) {
                if( arr[i] < arr[i - 1]) {
                    temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                    isSorted = false;
                }
            }
        }
        return arr;
    }
}
