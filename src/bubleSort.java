public class bubleSort {
    public static int[] flip(int[] arr) {
        /* Algorithm  of sort:
        1) Compare 2 elements
        2) swap or copy one of them
        3) move to next element
        Example:
        If arr[0] > arr[1] -> arr[1], arr[0]
         */
        int temp;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) { // 3 glasses:
                    temp = arr[j]; // in temp we put current element (1 empty glass)
                    arr[j] = arr[j + 1]; // in current element put next element
                    arr[j + 1] = temp; // in next element put temp value
                }
            }
        }
        return arr;
    }
}
