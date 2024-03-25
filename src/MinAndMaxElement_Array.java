import java.lang.reflect.Array;
import java.util.Arrays;

class Pair{
    int min;
    int max;
}
public class MinAndMaxElement_Array {
    static Pair getMinMax(int arr[]){
        int n = arr.length;
        Pair pair = new Pair();
        Arrays.sort(arr);
        pair.min = arr[0];
        pair.max = arr[n-1];
        return pair;
    }
    public static void main(String[] args) {

        int arr[] = {1,7,8,5,4,3,4,5};
        int num[] = {78,56,34,17,2,5,6,7};
        int n = arr.length;
        int min = arr[0];
        int max = arr[0];
        // Iterate through the array to find min and max values
        for (int i = 0; i < n; i++) {
            // Check for minimum value
            if (arr[i] < min) {
                min = arr[i];
            }

            // Check for maximum value
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
        //sort method
        Pair pair = getMinMax(num);
        System.out.println(pair.max);
        System.out.println(pair.min);
    }
}
