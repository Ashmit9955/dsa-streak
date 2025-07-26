public class LC34{

    public static int[] Brute(int arr[] , int k){
        int n = nums.length;
        int result[] = {-1, -1};
        int num = 0;
        for(int i=0; i<n; i++){
            if(nums[i] == target){
                if(result[0] == -1){
                    result[0] = i;
                    result[1] = i;
                }else{
                    result[1] = i;
                }
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