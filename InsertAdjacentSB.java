public class InsertAdjacentSB {
    static void insertAdj(String str, int n, int temp){
        if(n==temp){
            System.out.println(str);
            return;
        }

        if(str.charAt(n)==str.charAt(n+1)){
            char ch = '#';
            str = str.substring(0,n+1) + ch + str.substring(n+1);
            temp++;
        }

        insertAdj(str, n+1, temp);
    }

    public static void main(String args[]){
        String str = "aabbcc";
        insertAdj(str,0,str.length()-1);
    }
}