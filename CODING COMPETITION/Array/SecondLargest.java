import java.util.Scanner;
public class SecondLargest {
    public static int secondLargestNum(int[] arr){
        int max=0;
        int secondMax=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                secondMax=max;
                max=arr[i];
            }
        }
        return secondMax;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr ={1,2,3,4,5,6};
        int res = secondLargestNum(arr);
        System.out.println(res);
        sc.close();
    }
}
