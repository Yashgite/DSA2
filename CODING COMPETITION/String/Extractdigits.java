import java.util.Scanner;
public class Extractdigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String digit = s.replaceAll("\\D","");
        System.out.println(digit);
        sc.close();
    }
}
