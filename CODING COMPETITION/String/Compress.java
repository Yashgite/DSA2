import java.util.Scanner;

public class Compress{
    public static String compressedString(String str){
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0;i<str.length();i++){
            count++;
            if(i+1>=str.length() || str.charAt(i)!=str.charAt(i+1) ){
                sb.append(str.charAt(i));
                sb.append(count);
                count=0;
            }
        }
        return sb.length()<str.length()?sb.toString():str;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String res = compressedString(str);
        System.out.println(res);
    }
}
// import java.util.Scanner;

// public class Compress {
//     public static String compressedString(String s){
//         StringBuilder compressed = new StringBuilder();
//         int count=0;
//         for(int i=0;i<s.length();i++){
//             count++;
//             if(i+1>=s.length() || s.charAt(i)!=s.charAt(i+1)){
//                 compressed.append(s.charAt(i));
//                 compressed.append(count);
//                 count=0;
//             }
//         }

//         return compressed.length()<s.length()?compressed.toString():s;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String res = compressedString(str);
//         System.out.println(res);
//         sc.close();
//     }
// }