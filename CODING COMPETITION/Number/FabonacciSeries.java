import java.util.Scanner;

public class FabonacciSeries {

    public static int fabonacci(int i){
        if(i<=0){
            return i;
        }
        else{
            return fabonacci(i - 1) + fabonacci(i - 2);
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.print(fabonacci(i) );

        }
        sc.close();

        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the number of terms in the Fibonacci series: ");
        // int n = scanner.nextInt();
        // scanner.close();

        // int firstTerm = 0, secondTerm = 1;
        // System.out.print("Fibonacci Series: " + firstTerm + ", " + secondTerm);

        // for (int i = 3; i <= n; i++) {
        //     int nextTerm = firstTerm + secondTerm;
        //     System.out.print(", " + nextTerm);
        //     firstTerm = secondTerm;
        //     secondTerm = nextTerm;
    }
}
