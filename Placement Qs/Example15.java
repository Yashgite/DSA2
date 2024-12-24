// Program to find string is anagram or not.

import java.util.Arrays;
import java.util.Scanner;

public class Example15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the 1st String");
        String s1 = sc.nextLine();
        System.out.println("enter the 2nd String");
        String s2 = sc.nextLine();

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        if(s1.length()!=s2.length()){
            System.out.println("the strings are not anagram");
        }

        char[] charArray1 = s1.toCharArray();
        char[] charArray2 = s2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        if(Arrays.equals(charArray1, charArray2)){
            System.out.println("the string is Anagram");
        }else{
            System.out.println("the string is not Anagram");
        }

    }
}
