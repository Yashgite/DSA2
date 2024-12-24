import java.util.Scanner;
import java.util.Arrays;
import java.util.HashSet;
public class RemoveDuplicates {
    public static Integer[] removeDuplicates(int[] arr){
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }

        Integer[] newArray = seen.toArray(new Integer[0]);
        return newArray;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,4,5,2,3,4,5};
        Integer[] res = removeDuplicates(arr);
        System.out.println(Arrays.toString(res));
        
        sc.close();
    }
}
