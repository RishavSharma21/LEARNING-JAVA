package Sorting;

public class QuickSort {
    static void displayArr(int[] arr){
        for(int val : arr){
            System.out.print(val+" ");
        }
    }

    static void swap(int[] arr , int x , int y){
     int temp = arr[x];
     arr[x] = arr[y];
     arr[y] = temp;
    }

    static int partition(int[] arr , int st , int end){
       int pivot = arr[st];
       int count = 0;
        for (int i = st+1; i <= end ; i++) {
            if(arr[i] <= pivot) count++;
        }
        int pivotIdx = st+count;
        swap(arr,st,pivotIdx);

        int i = st , j = end;
        while (i < pivotIdx && j > pivotIdx){
            while (arr[i] <= pivot) i++;
            while (arr[j] > pivot) j--;

            if(i < pivotIdx && j > pivotIdx){
                swap(arr,i,j);
                i++;
                j--;
            }
        }

        return pivotIdx;
    }
    static void quicksort(int[] arr, int st, int end){
        if(st >= end) return;

        int pi = partition(arr,st,end);

        quicksort(arr,st,pi-1);
        quicksort(arr, pi+1, end);

    }

    public static void main(String[] args) {
        int[] arr = {6,3,1,5,4};
        System.out.println("Before Sorting");
        displayArr(arr);
        System.out.println();
        quicksort(arr,0,arr.length-1);

        System.out.println("After Sorting");
        displayArr(arr);
    }
}
