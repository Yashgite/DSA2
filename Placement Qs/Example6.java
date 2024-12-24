import java.util.*;

public class Example6 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 3, 2, 5, 6, 7, 8, 7};

        System.out.println("Original array: " + Arrays.toString(array));

        Set<Integer> uniqueNumbers = new HashSet<>();
        Set<Integer> duplicateNumbers = new HashSet<>();

        for (int num : array) {
            if (!duplicateNumbers.contains(num)) {
                if (uniqueNumbers.contains(num)) {
                    uniqueNumbers.remove(num);
                    duplicateNumbers.add(num);
                } else {
                    uniqueNumbers.add(num);
                }
            }
        }

        System.out.println("Unique numbers in the array: " + uniqueNumbers);
    }
}
