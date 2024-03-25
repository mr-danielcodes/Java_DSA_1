package Recursion;

public class IsArraySorted {
    public static boolean isSorted(int arr[],int n){
        //if array is empty or have one value we simply return
        if(n==0||n==1)
            return true;
        if (arr[n-1]<arr[n-2])
            return false;
        else {
            var remainingPart = isSorted(arr,n-1);
            return remainingPart;
        }
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};
        var result = isSorted(arr,arr.length);
        if(result)
            System.out.println("Array Sorted");
        else
            System.out.println("Array is not sorted");
    }
}
