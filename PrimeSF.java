public class PrimeSF {
    static boolean isPrime(int n, int div){
        if(div==1){
            return true;
        }
        if(n%div==0){
            return false;
        }
        div--;
        return isPrime(n,div);
    }
    public static void main(String args[]){
        final int n = 22;
        final int div = n/2;
        System.out.println(isPrime(n,div));
    }
}
