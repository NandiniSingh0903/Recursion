public class ElementCountSB {
    static void count(int arr[], int n, int x, int count){
        if(n==-1){
            if(count>0){
                System.out.println("Element count = "+count);
                return;
            }
            else{
                System.out.println("Element count = 0");
                return;
            }
        }

        if(arr[n]==x){
            count++;
        }
        count(arr, n-1, x, count);
    }
    public static void main(String args[]){
        final int arr[] = {10,20,30,10,40,50,10};
        final int x = 60;
        count(arr,arr.length-1,x,0);
    }
}
