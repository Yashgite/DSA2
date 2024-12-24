public class Example8 {
    public static void main(String[] args) {
        String[] array = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10"};
        
        int evenCount = 0;
        int oddCount = 0;
        
        for (String num : array) {
            int n = Integer.parseInt(num); // Convert string to integer
            if (n % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        
        System.out.println("Number of even integers: " + evenCount);
        System.out.println("Number of odd integers: " + oddCount);
    }
}
