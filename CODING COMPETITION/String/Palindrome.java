import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        String newStr = new String(sb);
        if(str.equals(newStr)){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        sc.close();
    }
}
