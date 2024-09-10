package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class AssignmentPractice {

    static int findMax(int[] arr) {           //function for finding the max element
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    static int[] sortArray(int[] arr) {
        int n = arr.length;
        int[] ans = new int[n];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (ans[i] > ans[j]) {
                    int temp = ans[i];
                    ans[i] = ans[j];
                    ans[j] = temp;
                }
            }
        }
        return ans;
    }


    //    Q1. Calculate the product of all the elements in the given array.
    static int findProduct(int[] arr) {
        int product = 1;
        for (int i = 0; i < arr.length; i++) {
            product = product * arr[i];
        }
        return product;
    }

    //    Q2. Find the second-largest element in the given Array in one pass.
    static int findSecondMax(int[] arr) {
        int max = findMax(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int sMax = findMax(arr);
        return sMax;
    }

    //    Q3. Find the minimum value out of all elements in the array.
    static int findMin(int[] arr) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    //    Q4. WAP to find the duplicate elements from the given array of elements.
    static int findDuplicate(int[] arr) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    ans = arr[i];
                }
            }
        }
        return ans;
    }

    //Q5. WAP to find the smallest missing positive element in the sorted Array. (take the array as input)
    static int smallestMissingElement(int[] arr) {
        int smallest = 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == smallest) {
                smallest++;
            }
        }
        return smallest;
    }

    //    Q6.Count the number of elements strictly greater than x.
    static int elementsGreaterThanX(int[] arr, int x) {
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x) {
                count++;
            }
        }
        return count;
    }

    //    Q7. WAP to find the largest three elements in the array.
    static int[] findLargestThreeElements(int[] arr) {
        int n = arr.length;
        int[] sortedArray = sortArray(arr);
        int[] ans = new int[3];
        ans[0] = sortedArray[n - 1];
        ans[1] = sortedArray[n - 2];
        ans[2] = sortedArray[n - 3];

        return ans;
    }

    //    Q8. Check if the given array is sorted or not
    static boolean checkSort(int[] arr) {
        int n = arr.length;
        //Handle edge cases
        if (n < 2) {        // An array with 0 or 1 element is considered sorted
            return true;
        }
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //    Q9. Find the difference between the sum of elements at even indices to the sum of elements at odd indices.
    static int findDiff(int[] arr) {
        int n = arr.length;
        int evensum = 0;
        int oddsum = 0;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                evensum += arr[i];
            } else {
                oddsum += arr[i];
            }
        }
        return evensum - oddsum;
    }
//    Q10. Given an array of integers, change the value of all odd indexed elements to its second multiple and
//    increment all even indexed values by 10.

    static void modifyArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                arr[i] += 10;
            } else {
                arr[i] *= 2;
            }
        }
    }

    //    Q11. Find the unique number in a given Array where all the elements are being repeated twice with one value
//    being unique.
//    Method 1
    static int findUnique(int[] arr) {
        int ans = arr[0];
        for (int i = 1; i < arr.length; i++) {
            ans ^= arr[i];                //XOR Property a^a = 0; assume input = 4 4 3 2 2
//                                          By xor solve this like - [(4^4) ^ 3 ^ (2^2)] = 3
        }
        return ans;
    }

    //    Method 2
    static int findUniqueElement(int[] arr) {
        // Iterate over every element
        for (int i = 0; i < arr.length; i++) {
            // Initialize count to 0
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                // Count the frequency of arr[i]
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            // If the count is 1, arr[i] is the unique number
            if (count == 1) {
                return arr[i];
            }
        }
        // Return -1 if no unique number is found
        return -1;
    }

    //Q12. If an array arr contains n elements, then check if the given array is a palindrome or not .
    static boolean checkPalindrome(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;

        while (start < end) {
            if (arr[start] != arr[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

//    Q13. Find the first non-repeating element in the array .

    static void firstNonRepeating(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int x = arr[i];
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] == x) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(x);
            }
        }
    }

//    Q16. Find the factorial of a number.

    static void factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }
        int fact = 1;

        if (n == 0) {
            fact = 1;
        } else {
            for (int i = 1; i <= n; i++) {
                fact *= i;
            }
        }
        System.out.println(fact);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements of Array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
//        }
//        System.out.println("Enter the value of X");
//        int x = sc.nextInt();

//        System.out.println(findProduct(arr));
//        System.out.println(findMax(arr));
//        System.out.println(findSecondMax(arr));
//        System.out.println(findMin(arr));
//        System.out.println(findDuplicate(arr));
//        System.out.println(smallestMissingElement(arr));
//        System.out.println(elementsGreaterThanX(arr,x));
//        int[] ans = sortArray(arr);
//        printArrya(ans);
//        int[] ans = findLargestThreeElements(arr);
//        printArray(ans);
//        boolean ans = checkSort(arr);
//        System.out.println(ans);
//        System.out.println(findDiff(arr));
//        modifyArray(arr);
//        printArray(arr);
//        System.out.println(findUnique(arr));
//        System.out.println(findUniqueElement(arr));
//        System.out.println(checkPalindrome(arr));
//     firstNonRepeating(arr);
//      factorial(x);

        }
    }
}