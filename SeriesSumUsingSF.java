public class SeriesSumUsingSF {
    static double seriesSum(int n){
        if(n==0){
            return 0;
        }

        double ans = n/Math.pow(n,n) + seriesSum(n-1);
        return ans;
    }
    public static void main(String args[]){
        System.out.println("Sum = "+seriesSum(2));
    }
}
