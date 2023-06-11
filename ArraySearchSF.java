public class ArraySearchSF {
    static int isPresent(int arr[], int n, int x){
        if(n==-1){
            return -1;
        }

        if(arr[n]==x){
            return n+1;
        }

        return isPresent(arr, n-1, x);
    }
    public static void main(String args[]){
        final int arr[] = {10,20,30,40,50};
        final int x = 70;
        if(isPresent(arr, arr.length-1, x)>0){
            System.out.println("Element is present at position "+isPresent(arr,arr.length-1,x));
        }
        else{
            System.out.println("Element is not present!");
        }
    }
}
