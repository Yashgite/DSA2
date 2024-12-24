import java.util.Scanner;
import java.util.HashSet;

public class UniqueDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String numStr = Integer.toString(n);
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<numStr.length();i++){
            set.add(numStr.charAt(i));
        }

        for(char c:set){
            System.out.print(c+" ");
        }
        sc.close();
    }
}
