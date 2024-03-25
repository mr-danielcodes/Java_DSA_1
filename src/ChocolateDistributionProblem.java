// JAVA Code For Chocolate Distribution Problem
import java.util.Arrays;

public class ChocolateDistributionProblem {

    /**
     * Calculates the minimum difference between the maximum and minimum chocolates
     * received by any student after distributing chocolates in packets.
     * @param arr Array representing sizes of chocolate packets.
     * @param m Number of students.
     * @return Minimum difference between maximum and minimum chocolates.
     */
    public static int chocolateDistribution(int arr[], int m) {
        // Check base cases
        if (arr.length == 0 || m == 0) {
            return 0;
        }
        // Sort the array to simplify calculations
        Arrays.sort(arr);
        // Check if there are enough packets for the given number of students
        if (arr.length - 1 < m) {
            // Invalid input
            return -1;
        }
        // Initialize minimum difference to the maximum possible integer value
        int min_diff = Integer.MAX_VALUE;
        // Iterate through the array to find the minimum difference
        for (int i = 0; i < arr.length; i++) {
            // Calculate the ending index of the current window
            int nextWindow = i + m - 1;
            // Break if the window goes beyond the bounds of the array
            if (nextWindow >= arr.length)
                break;
            // Calculate the difference between the last and first elements in the window
            int diff = arr[nextWindow] - arr[i];
            // Update the minimum difference if a smaller difference is found
            min_diff = Math.min(min_diff, diff);
        }
        // Return the calculated minimum difference
        return min_diff;
    }
    public static void main(String[] args) {
        // Example input
        int arr[] = {7,3,2,4,9,12,56};
        int m = 3;

        // Calculate the result using the chocolateDistribution method
        int result = chocolateDistribution(arr, m);

        // Print the result or indicate an invalid input
        if (result != -1) {
            System.out.println("Minimum difference is " + result);
        } else {
            System.out.println("Invalid input");
        }
    }
}
