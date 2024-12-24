import java.util.Scanner;

public class Palindrome {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=n;
        int reversenum=0;
        while (temp!=0) {
            int digit=temp%10;
            reversenum=reversenum*10+digit;
            temp=temp/10;
        }
        if (n==reversenum) {
            System.out.println("the number "+n+" is palindrome");
        }
        else{
            System.out.println("the number "+n+" is not palindrome");
        }
        sc.close();
    }
}
