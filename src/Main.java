import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{78, 56, 11, 2, 2, 23};
        System.out.println(Arrays.toString(arr)); // current array
        System.out.println(Arrays.toString(bubleSort.flip(arr))); // sorted array
        System.out.println(Arrays.toString(betterBubleSort.superSort(arr)));
        System.out.println(Arrays.toString(betterBubleSort2.fastSort(arr)));
    }
}