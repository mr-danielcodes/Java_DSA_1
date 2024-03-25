public class ArrayRotation {
    //brute forch approach
    public static void rotateArray(int[] arr, int d) {
        int n = arr.length;
        int[] temp = new int[n]; // Temporary array of size n

        // Copy elements from arr to temp with rotation
        for (int i = 0; i < n; i++) {
            temp[(i + n - d) % n] = arr[i];
        }
        // Print the rotated array
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i] + " ");
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int d = 2;

        rotateArray(arr, d);
        System.out.println();
    }
}
