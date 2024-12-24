//Write a program to check the no. is armstrong or not

import java.util.Scanner;

public class Example17 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();
        int count=0,sum=0;
        int temp=n;
        while (temp!=0) {
            int digit=temp%10;
            count++;
            temp=temp/10;
        }

        int temp2=n;
        while (temp2!=0) {
            int digit=temp2%10;
            sum=sum+(int)Math.pow(digit,count);
            temp2=temp2/10;
        }
        if(n==sum){
            System.out.println("the number is armstrong");
        }else{
            System.out.println("the number is no armstrong");
        }
    }
}
