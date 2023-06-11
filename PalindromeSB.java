public class PalindromeSB {
    static void reverse(String str){
        int n = str.length();
        if(n==0 || n==1){
            System.out.println("It's a palindrome!");
            return;
        }

        if(str.charAt(0)!=str.charAt(n-1)){
            System.out.println("It's not a palindrome!");
            return;
        }

        reverse(str.substring(1, n-1));
    }
    public static void main(String args[]){
        String str = "abba";
        reverse(str);
    }
}
