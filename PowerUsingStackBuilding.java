public class PowerUsingStackBuilding {
    static void powerOfANumber(int x, int y, int ans){
        if(y==0){
            System.out.println(ans);
            return;
        }
        ans = ans*x;
        y--;
        powerOfANumber(x, y, ans);

    }
    public static void main(String args[]){
        powerOfANumber(3,4,1);
    }
}
