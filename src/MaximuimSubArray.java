public class MaximuimSubArray {
    //brute force approach   -------->O(n^2)
        public static int findMaximiumSubArray(int arr[]){
        int maxSum = 0;
        int currSum = 0;
        int arrSize = arr.length;
        for(int i=0;i<arrSize;i++){
            currSum = 0;
            for(int j = i;j<arrSize;j++) {
                currSum += arr[j];
                if (currSum > maxSum) {
                    maxSum = currSum;
                }
            }
        }
        return maxSum;
    }
    //optimize approach by using kadane algorithm for finding maximium subarray
    public static int maxSumSubArray(int arr[]){
            int arrSize = arr.length;
            int maxSum = 0;
            int currSum = 0;
            //traverse by loop
        for(int i=0;i<arrSize;i++){
            currSum = currSum + arr[i];
            if (currSum > maxSum)
                maxSum = currSum;
            if (currSum < 0)
                currSum = 0;
        }
        return maxSum;
    }
    public static void main(String[] args) {
        //Driver Code
        int arr[] = {5,-4,-2,6,-1};
        System.out.println(findMaximiumSubArray(arr));
        System.out.println(maxSumSubArray(arr));
    }
}
