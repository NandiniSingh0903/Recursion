public class PowerUsingStackFalling {
    static int powerOfANumber(int x,int y){
        if(y==0){
            return 1;
        }
        int ans = x*powerOfANumber(x,y-1);
        return ans;
    }
    public static void main(String args[]){
        System.out.println(powerOfANumber(5,2));
    }  
}
