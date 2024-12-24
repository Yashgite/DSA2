import java.util.Scanner;
import java.util.HashMap;
import java.util.LinkedHashMap;
public class CharacterFrequancy{

    public static HashMap<Character, Integer> countCharacter(String str){
        LinkedHashMap<Character,Integer> freqMap = new LinkedHashMap<>();

        for(char c:str.toCharArray()){
            if(c!=' '){
            freqMap.put(c,freqMap.getOrDefault(c,0)+1);
            }
        }

        return freqMap;


    }
    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);
        String str = sc.nextLine();
        HashMap<Character, Integer> map = countCharacter(str);

        for(HashMap.Entry<Character,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        sc.close();
    }
}






// import java.util.Map;
// import java.util.LinkedHashMap;
// import java.util.Scanner;

// public class CharacterFrequancy {
//     public static Map<Character,Integer> countCharacterFrequency(String s){
//         LinkedHashMap<Character, Integer> freqmap = new LinkedHashMap<>();
//         for(char c:s.toCharArray()){
//                 if(c!=' '){
//                     freqmap.put(c,freqmap.getOrDefault(c,0)+1);
//                 }
//         }
//         return freqmap;
//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         String str = sc.nextLine();
//         Map<Character, Integer> map = countCharacterFrequency(str);

//         for(Map.Entry<Character,Integer> entry: map.entrySet()){
//             System.out.println(entry.getKey()+" : "+entry.getValue());
//         }
//         sc.close();
//     }
// }