public class PalindromeSF {
    static boolean reverse(String str){
        int n = str.length();
        if(n==0 || n==1){
            return true;
        }

        if(str.charAt(0)!=str.charAt(n-1)){
            return false;
        }

        return reverse(str.substring(1,n-1));
    }

    public static void main(String args[]){
        String str = "aabbba";
        if(reverse(str)){
            System.out.println("It's a palindrome!");
        }

        else{
            System.out.println("It's not a palindrome!");
        }
    }
}

