public class PrimeSB {
    static void isPrime(int n, int div){
        if(div == 1){
            System.out.println("Prime");
            return;
        }
        if(n%div==0){
            System.out.println("Not Prime");
            return;
        }
        div--;
        isPrime(n,div);
    }
    public static void main(String[] args){
        final int n = 18;
        final int div = n/2;
        isPrime(n,div);
    }
}
