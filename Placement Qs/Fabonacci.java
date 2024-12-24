import java.util.Scanner;

public class Fabonacci {
    static int faboseries(int i){
        if(i<=0){
            return i;
        }
        else{
            return faboseries(i-1)+faboseries(i-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(faboseries(i));
        }
    }
}
