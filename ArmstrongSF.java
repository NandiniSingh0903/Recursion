public class ArmstrongSF {
    static boolean isArmstrong(int num, int temp, int sum, int length){
        if(num==0){
            if(sum==temp)
                return true;
            else    
                return false;
        }
        int lastDigit = num%10;
        sum = sum + (int)Math.pow(lastDigit, length);
        return isArmstrong(num/10, temp, sum, length);
    }
    public static void main(String args[]){
        final int n = 121;
        final int length = 3;
        System.out.println(isArmstrong(n, n, 0, length)? "It's an armstrong number!" : "It's not an armstrong number!");
    }
}
