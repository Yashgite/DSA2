import java.util.Scanner;
public class DigitsumPrime {
    public static boolean isPrime(int sum){
        if(sum<=1){
            return false;
        }
         for(int i=2;i<=Math.sqrt(sum);i++){
            if(sum%i==0){
            return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        while(n!=0){
            sum=sum+n%10;
            n=n/10;
        }
        if(isPrime(sum)){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        sc.close();
    }
}
