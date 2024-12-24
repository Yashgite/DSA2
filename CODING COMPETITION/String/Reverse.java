import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        String str = sc.next();
        StringBuilder sb = new StringBuilder(str);
        sb.reverse();
        //String newStr = new String(sb);
        //System.out.println(newStr);
        System.out.println(sb.toString());
        sc.close();
    }
}