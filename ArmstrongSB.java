public class ArmstrongSB {
    static void isArmstrong(int n,int temp, int sum, int length){
        if(n==0){
            if(sum==temp)
                System.out.println("It's an armstrong number!");
            else
                System.out.println("It's not an armstrong number!");
            return;
        }
        int lastDigit = n%10;
        sum = sum + (int)Math.pow(lastDigit,length);
        isArmstrong(n/10,temp,sum,length);
    }
    public static void main(String args[]){
        final int n = 121;
        final int length = 3;
        isArmstrong(n,n,0,length);
    }
}
