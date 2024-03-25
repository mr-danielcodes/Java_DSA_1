import java.util.HashSet;

public class ContainsDuplicateInArray {
    //my first try but code is not well written
    public static boolean checkOccurence1(int arr[]){
        int counter = 0;
        boolean flag = false;
        for(int i=0;i<arr.length;i++){
            counter = 0;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    counter++;
                }
                if (counter==2){
                    flag = true;
                }
            }
        }
        return flag;
    }
    //Time complexity of brute forch approach O(n)2
    public static boolean checkOccurence2(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;//return true if duplicate found
                }
            }
        }
        return false;
    }
    //optimize approach
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,1};
        System.out.println(containsDuplicate(arr));
    }
}
