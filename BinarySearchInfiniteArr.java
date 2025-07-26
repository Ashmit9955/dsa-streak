/* 
This is a Binary Search based question

We have an array of infinite length and also we have a target element which we have to find and return its index

Its just that because the array is of inifnite length ... so it means we can not use use the array.length function

Now the approach would be to use Binary search but we cant have end = n-1; so we will have to use chunks of array 

See in the array [1,4,6,7,8,9,12,23,45,67,69,87,99]  target = 69

In first chunk 1 to 4 (4 < 69, so dont pick this chunk and change our start and end indexes) 

Later on when our end reaches 99 we will see thay the target is less than 99 so we will pick this 99 as our end and whatever start we got as the start

*/


import java.util.*;

public class BSInfinite{
    public static int mainFunc(int arr[] , int k){
        int n = arr.length;
        int st = 0;
        int end = 1;
        while(end < arr.length && arr[end] < k){
            int temp = end + 1;
            end = end + (end - st + 1)*2 ;
            st = temp;
        }
        if(end > arr.length){
            return -1;
        }
        return binarySearch(arr , k, st , end);
    }
    
    public static int binarySearch(int arr[] , int k , int s , int e){
        int n = arr.length;
        int st = s , end = e;
        while(st <= end){
            int mid = st + (end-st)/2;
            if(arr[mid] > k) end = mid -1;
            else if(arr[mid] < k) st = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,4,6,7,8,9,12,23,45,67,69,87,99};
        int k = sc.nextInt();
        int ans = mainFunc(arr , k);
        System.out.println(ans);
    }
}