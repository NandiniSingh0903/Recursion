public class ReplaceAdjacentSF {
    static String replaceAdj(String str, int n, int temp){
        if(n==temp){
            return str;
        }

        if(n>0 && str.charAt(n)==str.charAt(n-1)){
            char ch = '#';
            str = str.substring(0,n) + ch + str.substring(n+1);
        }

        return replaceAdj(str, n+1, temp);
    }
    public static void main(String args[]){
        String str = "aaabbcc";
        System.out.println(replaceAdj(str, 0, str.length()));
    }
}
