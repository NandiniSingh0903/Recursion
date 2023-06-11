public class ReplaceAllSB {
    //replacing x with y
    static void replaceAll(int arr[], int n, int temp, int x, int y){
        if(n==-1){
            for(int i=0;i<=temp;i++){
                System.out.print(arr[i]+" ");
            }
            return;
        }

        if(arr[n]==x){
            arr[n]=y;
        }
        replaceAll(arr, n-1, temp, x, y);
    }
    public static void main(String args[]){
        final int arr[] = {10,20,10,30,40,10};
        final int x = 10;
        final int y = 90;
        replaceAll(arr, arr.length-1, arr.length-1, x, y);    }
}