public class ArmstrongNum {
    public static void main(String[] args) {
        int n = 153;
        int temp1=n;
        int count=0;
        while(temp1!=0){
            count++;
            temp1=temp1/10;
        }
        System.out.println(count);

        int sum=0;
        int temp2=n;
        while (temp2!=0) {
            int digit = temp2%10;
            sum=sum+(int)Math.pow(digit,count);
            temp2=temp2/10;
        }

        if(n==sum){
            System.out.println("the number "+sum+" is armstrong num");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
