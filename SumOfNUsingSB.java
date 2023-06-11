public class SumOfNUsingSB {
    static void sum(int n,int ans){
        if(n==0){
            System.out.println(ans);
            return;
        }

        ans = ans + n;
        sum(n-1, ans);
    }
    public static void main(String args[]){
        sum(6,0);
    }
}
