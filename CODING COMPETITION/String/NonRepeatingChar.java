import java.util.Scanner;
import java.util.HashMap;

public class NonRepeatingChar{
    public static char firstNonrepeatingChar(String s){
        HashMap<Character,Integer> map = new HashMap<>();
        for(char c:s.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char c:s.toCharArray()){
            if(map.get(c)==1){
                return c;
            }
        }
        return '*';
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s = sc.nextLine();
        char res = firstNonrepeatingChar(s);
        System.out.println(res);
        sc.close();
    }
}



// import java.util.Scanner;
// import java.util.HashMap;

// public class NonRepeatingChar {
//     static char isNonRepeatingChar(String s) {

//         HashMap<Character, Integer> map = new HashMap<>();

//         for (char c : s.toCharArray()) {
//             map.put(c, map.getOrDefault(c, 0) + 1);
//         }

//         for (char c : s.toCharArray()) {
//             if (map.get(c) == 1) {
//                 return c;
//             }
//         }
//         return '*';  // Return '*' if no non-repeating character found
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string:");
//         String str = sc.nextLine();
        
//         // Find and print the result
//         char result = isNonRepeatingChar(str);
//         System.out.println("First non-repeating character: " + result);
        
//         sc.close();
//     }
// }
