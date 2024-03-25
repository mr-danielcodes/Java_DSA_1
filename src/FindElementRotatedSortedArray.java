public class FindElementRotatedSortedArray {
    //brute force approach
    public static int findElement(int arr[],int target) {
        for(int i=0;i< arr.length;i++){
            if(arr[i]==target){
                return i;
            }
        }
        return -1;
    }
    //optimize approach
    public static int binarySearch(int arr[],int key){
        int high = arr.length-1;
        int low = 0;
        while (low<=high){
            int mid = (low+high)/2;
            //check the mid for key
            if(key==arr[mid])
                return mid;
            if(arr[low]<arr[mid]){
                if(key>=arr[low]&&key<arr[mid])
                    high = mid-1;
                else
                    low = mid+1;

            }else{
                if(key>arr[mid]&&key<arr[high])
                    low = mid+1;
                else
                    high = mid-1;
            }
        }
        return -1;
    }
    //pass all test cases of leet code
    public static int search(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;

            if (arr[mid] == target)
                return mid;
            // Left half is sorted
            if (arr[low] <= arr[mid]) {
                if (target >= arr[low] && target < arr[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            // Right half is sorted
            else {
                if (target > arr[mid] && target <= arr[high])
                    low = mid + 1;
                else
                    high = mid - 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        //find the element in rotated and sorted array
        int arr[] = {4,5,6,7,0,1,2};
        int target = 0;
        System.out.println(findElement(arr,target));
        System.out.println(binarySearch(arr,target));
    }
}
