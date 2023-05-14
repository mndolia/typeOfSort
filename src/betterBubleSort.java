public class betterBubleSort {
    public static int[] superSort(int[] arr) {
        int temp;
        boolean statusSort = false;
        while (!statusSort) {
            statusSort = true;
            for(int i = 0; i < arr.length -1; i++) {
                if( arr[i] < arr[i + 1]) {
                    statusSort = false;
                    temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
        return arr;
    }
}
