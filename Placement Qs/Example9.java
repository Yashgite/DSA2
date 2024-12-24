import java.util.*;

public class Example9 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 6, 7, 8, 9, 10}; // Example array with one missing number
        int n = 10; // Assuming the array should contain numbers from 1 to n

        List<Integer> missingNumbers = findMissingNumbers(array, n);

        if (missingNumbers.isEmpty()) {
            System.out.println("No missing numbers.");
        } else {
            System.out.println("Missing number(s): " + missingNumbers);
        }
    }

    public static List<Integer> findMissingNumbers(int[] array, int n) {
        List<Integer> missingNumbers = new ArrayList<>();
        boolean[] present = new boolean[n + 1];

        for (int num : array) {
            present[num] = true;
        }

        for (int i = 1; i <= n; i++) {
            if (!present[i]) {
                missingNumbers.add(i);
            }
        }

        return missingNumbers;
    }
}
