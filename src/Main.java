import java.util.Stack;

public class Main {
    public static void sortStack(Stack<Integer> stack) {
        if (stack.isEmpty()) {
            return; // Stack is already sorted or empty
        }

        int size = stack.size();
        int[] tempArray = new int[size];

        // Step 1: Pop all elements from stack and store them in temp array
        for (int i = 0; i < size; i++) {
            tempArray[i] = stack.pop();
        }

        // Step 2: Sort the temporary array in ascending order
        // Here, we use a simple bubble sort algorithm for demonstration purposes
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (tempArray[j] > tempArray[j + 1]) {
                    int temp = tempArray[j];
                    tempArray[j] = tempArray[j + 1];
                    tempArray[j + 1] = temp;
                }
            }
        }

        // Step 3: Push sorted elements back onto the stack
        for (int i = size - 1; i >= 0; i--) {
            stack.push(tempArray[i]);
        }
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(3);
        stack.push(8);
        stack.push(1);
        stack.push(4);

        System.out.println("Stack before sorting: " + stack);

        sortStack(stack);

        System.out.println("Stack after sorting: " + stack);
    }
}
