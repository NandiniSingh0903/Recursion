public class SearchAllIndexSB {
    static void searchAll(int arr[], int n, int x, int result[], int index){
        if(n==-1){
            for(int i=0;i<result.length;i++){
                if(result[i]!=-1)
                    System.out.println(result[i]);
            }
            return;
        }
        if(arr[n]==x){
            result[index]=n;
            index++;
        }
        searchAll(arr, n-1, x, result, index); 
    }
    public static void main(String args[]){
        final int arr[] = {20,10,30,10,10,40};
        final int result[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            result[i]=-1;
        }
        final int x = 10;
        searchAll(arr, arr.length-1, x, result, 0);
    }
}
