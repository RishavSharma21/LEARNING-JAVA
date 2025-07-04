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
//        int target = 10;
        int x = 25;
//        System.out.println(firstOccurrence(a,target));
        System.out.println(squareRoot(x));
    }
}
 