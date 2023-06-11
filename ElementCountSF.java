public class ElementCountSF {
    static int count(int arr[], int n, int x){
        if(n==-1){
            return 0;
        }
    
        int count = arr[n]==x? 1:0;
        return count + count(arr, n-1, x);

    }
    public static void main(String args[]){
        final int arr[] = {10,20,30,10,40,50,10};
        final int x = 60;
        System.out.println("Element count = "+count(arr,arr.length-1,x));
    }
}
