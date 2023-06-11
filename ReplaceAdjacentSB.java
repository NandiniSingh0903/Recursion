public class ReplaceAdjacentSB {
    static void replaceAdj(String str, int n, int temp){
        if(n==temp){
            System.out.println(str);
            return;
        }
        if(n>0 && str.charAt(n)==str.charAt(n-1)){
            char ch = '#';
            str = str.substring(0,n) + ch + str.substring(n+1);
        }
        replaceAdj(str, n+1, temp);
    }
    public static void main(String args[]){
        String str = "aaabbccdd";
        
        replaceAdj(str, 1, str.length());
    }
}