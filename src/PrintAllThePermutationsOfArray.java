import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PrintAllThePermutationsOfArray {
    // Brute-force approach to print all permutations
    //that approach is wrong because it generates only 3 permutations
    static void printPermutations(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Swap elements at index i and j
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                // Print the current permutation
                System.out.println(Arrays.toString(arr));

                // Swap back to revert the changes for the next iteration
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }

    // Backtracking approach to generate all permutations
    static public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> resultList = new ArrayList<>();
        backtrack(resultList, new ArrayList<>(), nums);
        return resultList;
    }

    // Backtracking helper function
    static public void backtrack(List<List<Integer>> resultList, ArrayList<Integer> tempList, int[] nums) {
        // If we match the length, it is a permutation
        if (tempList.size() == nums.length) {
            resultList.add(new ArrayList<>(tempList));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            int number = nums[i];
            // Skip if we get the same element
            if (tempList.contains(number))
                continue;
            // Add the new element
            tempList.add(number);
            // Go back to try other elements
            backtrack(resultList, tempList, nums);
            // Remove the added element (backtrack)
            tempList.remove(tempList.size() - 1);
        }
    }
    public static void main(String[] args) {
        // Example: Print all permutations
        int arr[] = {1, 2, 3};
        //Generate and display permutations using backtracking
        List<List<Integer>> result = permute(arr);
        System.out.println("Permutations (Backtracking):");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}
