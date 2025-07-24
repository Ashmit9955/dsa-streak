public class LC34{

    public static int[] Brute(int arr[] , int k){
        int n = arr.length;
        int result[] = {-1,-1};
        int num = 0;
        for(int i=0; i<n;i++){
            if(arr[i] == k){
                result[num++] = i;
            }
        }
        return result;
    }

    public static void main(String args[]){
        int arr[] = {5,7,7,8,8,10};
        int k = 8;
        int result[] = Brute(arr ,k);
        for(int i=0; i<result.length;i++){
            System.out.print(result[i] + " ");
        }
    }
}