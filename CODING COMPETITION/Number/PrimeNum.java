import java.util.Scanner;
public class PrimeNum{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        boolean isPrime=true;
        if(num==1){
            System.out.println("Not Prime");
        }else{
            isPrime=true;
            for(int i=0;i<Math.sqrt(num);i++){
                if(num%i==0){
                    isPrime=false;
                    break;
                }
           }
        }

        if(isPrime){
            System.out.println("Prime");
        }else{
            System.out.println("Not Prime");
        }
        sc.close();
    }
}