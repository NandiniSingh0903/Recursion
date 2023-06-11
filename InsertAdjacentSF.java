public class InsertAdjacentSF {
    static String insertAdj(String str, int n, int temp){
        if(n==temp){
            return str;
        }

        if(str.charAt(n)==str.charAt(n+1)){
            char ch ='#';
            str = str.substring(0,n+1) + ch + str.substring(n+1);
            temp++;
        }

        return insertAdj(str, n+1, temp);
    }

    public static void main(String args[]){
        String str = "aaabbbccc";

        System.out.println(insertAdj(str, 0, str.length()-1));
    }   
}