public class ArraySearchSB {
    static void isPresent(int arr[], int n, int x){
        if(n==-1){
            System.out.println("Element is not present!");
            return;
        }

        if(arr[n]==x){
            System.out.println("Element is present at position "+(n+1));
            return;
        }

        isPresent(arr, n-1, x);
    }
    public static void main(String args[]){
        final int arr[] = {10,20,30,40,50};
        final int x = 50;
        isPresent(arr, arr.length-1, x );
    }
}

