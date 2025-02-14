package Recursion;

import java.util.ArrayList;

public class Problems3 {

    //Given an array of integer and target value x , print whether x exist or not

    static boolean findTarget(int[] arr,int target,int idx){
        int n = arr.length;
        //base case
        if(idx >= n) {
            return false;
        }

        //self work
        if(arr[idx] == target) return true;

        //recursive work
        return findTarget(arr,target,idx+1);  // as the statement is boolean,so it will give either true or false
                                                  // so no need of if else

//        if (findTarget(arr,target,idx+1)){
//            return true;
//        } else {
//            return false;
//        }
    }

    //Given an array of integer and target value x , print -1 ,if doesn't exist else print index of where present
     //finding first index
    static int findTarget2(int[] arr,int target,int idx){
        int n = arr.length;
        //base case
        if(idx >= n){
            return -1;
        }

        //self work
        if(arr[idx] == target){
            return idx;
        }

        //recursive work

       return findTarget2(arr,target,idx+1);
    }

    //Given an array of integer and target value x , print -1 if doesn't exist else print index of where present
    //Print all indices where target is present

    static void findTarget3(int[] arr, int target,int idx){
        int n = arr.length;
        //base case
        if(idx >= n){
            return;
        }

        //self work
        if(arr[idx] == target){
            System.out.print(idx+" ");
        }

        //recursive work
        findTarget3(arr,target,idx+1);
    }

    ////Given an array of integer and target value x , print -1 if doesn't exist else print index of where present
    //    //Print all indices where target is present
    //Sme above question with ArrayList

    static ArrayList<Integer> findIndicesOfTarget(int[] arr,int target,int idx){
        //base case
        if(idx >= arr.length){
            return new ArrayList<Integer>();   //return empty arrayList
        }

        //self work
        ArrayList<Integer> ans = new ArrayList<>();
        if(arr[idx] == target){
            ans.add(idx);
        }

        //recursive work
        ArrayList<Integer> smallAns = findIndicesOfTarget(arr,target,idx+1);
        ans.addAll(smallAns);     //ans.addAll is a method to add values of smallAns to ans
        return ans;
    }


    static boolean isSorted(int[] arr,int idx){
        //base case
        if(idx == arr.length-1) {
            return true;
        }

        //self work
        if(arr[idx] > arr[idx+1]){
            return false;
        }

        //recursive work
        return isSorted(arr,idx+1);

    }
    //find last index of the given target
    static int lastIndex(int[] arr,int target,int idx){
        //base case
        if(idx < 0){
            return -1;
        }

        //self work
        if(arr[idx] == target){
            return idx;
        }

        //recursive work
       return lastIndex(arr,target,idx-1);
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,2,6};
        int target = 2;

//        if(findTarget(arr,target,0)){
//            System.out.println("Yes");
//        } else {
//            System.out.println("No");
//        }

//        System.out.println(findTarget2(arr,target,0));
//        findTarget3(arr,target,0);

//        ArrayList<Integer> ans  = findIndicesOfTarget(arr,target,0);
//        for (Integer i : ans){
//            System.out.print(i+" ");
//        }

        int ans = lastIndex(arr,target,arr.length-1);
//        System.out.println(ans);

        System.out.println(isSorted(arr,0));

    }
}
