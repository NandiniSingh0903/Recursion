public class SeriesSumUsingSB {
    static void seriesSum(int n, double ans){
        if(n==0){
            System.out.print(ans);
            return;
        }
        
        ans = ans + n/Math.pow(n,n);
        seriesSum(n-1, ans);
    }
    public static void main(String args[]){
        seriesSum(3,0.0);
    }
}
