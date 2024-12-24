import java.util.Scanner;
import java.util.HashSet;
public class FindDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,3,4,5,2,3,4,5};
        HashSet<Integer> seen = new HashSet<>();
        HashSet<Integer> duplicates = new HashSet<>();
        for(int num:arr){
            if(!seen.add(num)){
                duplicates.add(num);
            }
        }
        System.out.println(duplicates);
        sc.close();
    }
}
