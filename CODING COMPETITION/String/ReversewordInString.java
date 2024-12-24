import java.util.Scanner;

public class ReversewordInString{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        StringBuilder res = new StringBuilder();

        String words[] = str.split(" ");

        for(String ch:words){
            StringBuilder sb= new StringBuilder(ch);

            res.append(sb.reverse().toString()).append(" ");
        }
        System.out.println(res.toString());
    }
}

// import java.util.Scanner;
// public class ReversewordInString {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();

//         StringBuilder result = new StringBuilder();

//         String[] words = str.split(" ");

//         for(String word: words){
//             StringBuilder sb = new StringBuilder(word);
//             result.append(sb.reverse().toString()).append(" ");
//         }

//         System.out.println(result.toString());
//         sc.close();
//     }
// }
