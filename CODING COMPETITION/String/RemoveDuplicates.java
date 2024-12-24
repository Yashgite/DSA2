import java.util.Scanner;
import java.util.HashSet;

class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        HashSet<Character> set = new HashSet<>();
        StringBuilder sb = new StringBuilder();

        for(char c:s.toCharArray()){
            if(!set.contains(c)){
                set.add(c);
                sb.append(c);
            }
        }

        System.out.println(sb.toString());
        sc.close();
    }
}



// import java.util.Scanner;
// import java.util.HashSet;
// public class RemoveDuplicates {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str= sc.nextLine();

//         HashSet<Character> seen = new HashSet<>();
//         StringBuilder sb = new StringBuilder();

//         for(char c:str.toCharArray()){
//             if(!seen.contains(c)){
//                 seen.add(c);
//                 sb.append(c);
//             }
//         }

//         System.out.println(sb.toString());
//         sc.close();
//     }
// }
