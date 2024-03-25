package StackQuestions;

import java.util.Stack;

public class ReverseTheStack {
    //with naive approach
    public static Stack<Integer> reverseStack(Stack<Integer> stack){
        Stack<Integer> newStack = new Stack<>();
        int length = stack.size();
        while (stack.isEmpty()){  //length!= newStack.size() this condition can also work
                int element = stack.pop();
                newStack.add(element);
            }
        return newStack;
    }
    //with recursion approach
    public static void reverse(Stack<Integer> stack) {
        // Base case: if the stack is empty or has only one element, return
        if (stack.isEmpty() || stack.size() == 1) {
            return;
        }
        // Pop the top element from the stack
        int top = stack.pop();

        // Recursively reverse the remaining elements of the stack
        reverse(stack);

        // Move the popped element to the bottom of the reversed stack
        insertAtBottom(stack, top);
    }
    // Helper function to insert an element at the bottom of the stack
    private static void insertAtBottom(Stack<Integer> stack, int item) {
        // Base case: if the stack is empty, push the item to the stack
        if (stack.isEmpty()) {
            stack.push(item);
            return;
        }
        // Pop the top element and insert the item at the bottom recursively
        int top = stack.pop();
        insertAtBottom(stack, item);
        // Push the popped element back onto the stack
        stack.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        sc.push(1);
        sc.push(2);
        sc.push(3);
        sc.push(4);
        sc.push(5);
        reverse(sc);

        for (int element:sc){
            System.out.print(element+" ");
        }
    }
}



