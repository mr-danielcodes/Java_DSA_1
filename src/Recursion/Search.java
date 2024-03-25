package Recursion;

public class Search {
    //Linear Search with recursive call
    public static int linearSearch(int arr[], int n, int key) {
        // base case
        if (n == 0)
            return -1;

        // check the tail element from array
        if (arr[n-1] == key)
            return arr[n-1];
        else
            // recursive call with the result returned
            return linearSearch(arr, n - 1, key);
    }
    //Binary Search
    public static int binarySearch(int arr[],int low,int high,int key){
        //base case
        if(low>high)
            return -1;
        int mid = (low+high)/2;
        if (arr[mid]==key)
            return arr[mid];
        if (key<arr[mid])
            //search in left part
            return  binarySearch(arr,low,mid-1,key);
        else
            //search in right part

            return binarySearch(arr,mid+1,high,key);
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        var key = 6;
        System.out.println(linearSearch(arr,arr.length,key));
        System.out.println(binarySearch(arr,0,arr.length,key));
    }
}
