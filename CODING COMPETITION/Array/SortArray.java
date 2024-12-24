import java.util.Arrays;
import java.util.Collections;

public class SortArray {
    public static void main(String[] args) {
        int arr[] = {2, 6, 3, 9, 4, 7, 1, 8};
        
        // Convert int[] to Integer[] for sorting
        Integer[] integerArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        
        // Sort the first half in ascending order
        sortFirstHalfArray(integerArr);
        
        // Sort the second half in descending order
        sortSecondHalfArray(integerArr);
        
        // Convert back to int[] for output
        arr = Arrays.stream(integerArr).mapToInt(Integer::intValue).toArray();
        
        // Print the sorted array
        System.out.println(Arrays.toString(arr));
    }

    public static void sortFirstHalfArray(Integer[] arr) {
        int mid = arr.length / 2;
        Integer[] firstHalf = Arrays.copyOfRange(arr, 0, mid);
        Arrays.sort(firstHalf);
        System.arraycopy(firstHalf, 0, arr, 0, mid);
    }

    public static void sortSecondHalfArray(Integer[] arr) {
        int mid = arr.length / 2;
        Integer[] secondHalf = Arrays.copyOfRange(arr, mid, arr.length);
        Arrays.sort(secondHalf, Collections.reverseOrder());
        System.arraycopy(secondHalf, 0, arr, mid, secondHalf.length);
    }
}
