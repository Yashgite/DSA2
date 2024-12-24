import java.util.Scanner;

public class ExtractSpecialsymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String symbol = s.replaceAll("[a-zA-Z0-9]","");
        System.out.println(symbol);
        sc.close();
    }
}
