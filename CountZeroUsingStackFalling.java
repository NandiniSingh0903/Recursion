public class CountZeroUsingStackFalling{
    static int countZero(int num){
        //int count;
        if(num==0){
            return 1;
        }
        else if(num<10){
            return 0;
        }
        else{
            int lastDigit = num%10;
            int count=countZero(num/10);
            if(lastDigit==0){
                count++;
            }
            return count;
        }
    }
    public static void main(String args[]){
        System.out.println("No. of Zeros = "+countZero(100202));
    }
}