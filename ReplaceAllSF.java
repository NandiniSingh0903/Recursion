public class ReplaceAllSF {
    static int[] replaceAll(int arr[], int n, int x, int y){
        if(n==-1){
            return arr;
        }
        
        if(arr[n]==x){
            arr[n] = y;
        }
        return replaceAll(arr, n-1, x, y);
    }
    public static void main(String args[]){
        final int arr[] = {10,20,30,10,40,50};
        final int x = 10;
        final int y = 90;
        replaceAll(arr, arr.length-1,x,y);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
