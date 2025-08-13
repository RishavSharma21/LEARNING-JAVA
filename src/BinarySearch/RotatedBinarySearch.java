package BinarySearch;

public class RotatedBinarySearch {

    static int findMinIndex(int[] arr){
        int n = arr.length;
        int st = 0;
       int end = n-1;
       int ans = -1;

       while (st <= end){
           int mid = st + (end-st)/2;

           if(arr[mid] <= arr[n-1]){
               ans = mid;
               end = mid-1;
           } else {
               st = mid+1;
           }
       }
       return ans;
    }

    static int findIndexOfTarget(int[] arr,int target){
        int n = arr.length;
        int st = 0;
        int end = n-1;
        
        while (st <= end){
            int mid = st + (end - st)/2;
            if(arr[mid] == target){
                return mid;
            } else if (arr[mid] < arr[end]) {   // mid to end is sorted
                if(target > arr[mid] && target <= arr[end]){
                    st = mid+1;
                }else {
                    end = mid-1;
                }
            } else {      //st to mid is sorted
                if(target >= arr[st] && target < arr[mid]){
                    end = mid-1;
                }else {
                    st = mid+1;
                }
            }
        }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
//        System.out.println(findMinIndex(arr));
        System.out.println(findIndexOfTarget(arr,4));
    }
}

