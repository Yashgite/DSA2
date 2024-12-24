import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        int vowelCount=0;
        int consonentCount=0;

        for(int i=0;i<str.length();i++){
            if (ch[i]=='a' || ch[i]=='i' || ch[i]=='e' || ch[i]=='o' || ch[i]=='u') {
                vowelCount++;
            }
            else{
                consonentCount++;
            }
        }
        System.out.println(vowelCount+" "+consonentCount);
        sc.close();
    }
}
