// Java implementation of iterative Binary Search

import java.io.*;

class BinarySearch {

    // Returns index of x if it is present in arr[].
    int binarySearch(int arr[], int key)
    {
        int low = 0;
        int high = arr.length-1;
        while (low<=high){
            int mid = (low+high)/2;
           //check if the key is greater than middle discard left array
            if(arr[mid]==key)
                return mid;
            //check if key greater than middle element
            if(key>arr[mid])
                low = mid+1;
            //in else part key smaller than middle element
            else
                high = mid-1;
        }

        return -1;
    }

    // Driver code
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
        int arr[] = {1,2,3,4,5,6,7,8,9 };
        int key = 9;
        int result = ob.binarySearch(arr, key);
        if (result == -1)
            System.out.println("Key is no present  in array");
        else
            System.out.println("Element is present at " + "index " + result);
    }
}
