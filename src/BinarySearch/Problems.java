package BinarySearch;

public class Problems {

    static int firstOccurrence(int[] a,int target){
        int n = a.length;
        int st = 0, end = n-1;
        int fo = -1;

        while (st <= end){
            int mid = st + (end - st)/2;
            if(a[mid] == target){
                fo = mid;
                end = mid-1;
            } else if (target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return fo;
    }
    static int LastOccurrence(int[] a,int target){
        int n = a.length;
        int st = 0, end = n-1;
        int lo = -1;
        while (st <= end){
            int mid = st+(end-st)/2;
            if(a[mid] == target){
                st = mid+1;
                lo = mid;
            } else if(target < a[mid]){
                end = mid-1;
            } else {
                st = mid+1;
            }
        }
        return lo;
    }

    static boolean recursiveBinarySearch(int[] arr,int st,int end, int target) {
        if (st > end) return false;

        int mid = st + (end - st) / 2;

        if (target == arr[mid]) {
            return true;
        } else if (target < arr[mid]) {
            return recursiveBinarySearch(arr, st, mid - 1, target);
        } else {
            return recursiveBinarySearch(arr, mid + 1, end, target);
        }
    }

    static int squareRoot(int x){
        int st = 0 , end = x;
        int ans = -1;

        while (st <= end){
            int mid = st + (end - st)/2;
            int val = mid *  mid;
            if(val == x){
                return mid;
            } else if (val < x) {
                ans = mid;
                st = mid+1;
            } else {
                end = mid-1;
            }
        }
        return ans;
    }

  
    
    public static void main(String[] args) {
        int[] a = {2,2,4,5,6,7,7};
        int target = 7;
        System.out.println(recursiveBinarySearch(a,0,a.length-1,target));
//        int x = 25;
//        System.out.println(firstOccurrence(a,target));
//        System.out.println(squareRoot(x));
//        System.out.println(LastOccurrence(a,target));
    }
}