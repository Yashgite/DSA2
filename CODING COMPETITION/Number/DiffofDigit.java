import java.util.Scanner;
public class DiffofDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int smallest=9;
        int largest=0;

        while(n>0){
            int digit = n%10;
            smallest = Math.min(smallest,digit);
            largest = Math.max(largest,digit);
            n=n/10;
        }

        int diff = largest - smallest;
        System.out.println(diff);
        sc.close();
    }
}
