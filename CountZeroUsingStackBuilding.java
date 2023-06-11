public class CountZeroUsingStackBuilding {
    static void countZero(int num, int count){
        if(num==0){
            System.out.print(count);
            return;
        }

        int lastDigit = num%10;
        if(lastDigit==0)
            count++;
        countZero(num/10, count);
    }
    public static void main(String args[]){
        countZero(1002,0);
    }    
}
