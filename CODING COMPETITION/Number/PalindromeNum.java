public class PalindromeNum {
    public static void main(String[] args) {
        int n=121;
        int temp = n;
        int rev = 0;
        while (n!=0) {
            rev=rev*10+n%10;
            n=n/10;
        }
        if (rev==temp) {
            System.out.println("Number is Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}
