public class SumOfNUsingSF {
    static int sum(int n){
        if(n==0){
            return 0;
        }

        int ans = n + sum(n-1);
        return ans;
    }
    public static void main(String args[]){
        System.out.print(sum(5));
    }
}
