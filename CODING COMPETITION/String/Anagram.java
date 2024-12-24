import java.util.Scanner;
import java.util.Arrays;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1= sc.next();
        String str2 = sc.next();
        str1.toLowerCase();
        str2.toLowerCase();

        char ch1[] = str1.toCharArray();
        char ch2[] = str2.toCharArray();

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        String newStr1 = new String(ch1);
        String newStr2 = new String(ch2);

        if (newStr1.equals(newStr2)) {
            System.out.println("yes");

        }else{
            System.out.println("no");
        }

        sc.close();

    }
}
