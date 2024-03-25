package Recursion;

import java.util.Stack;

public class ReverseStackWithRecursion {
    public static void reverse(Stack<Integer> inputstack){
        //base case
        if(inputstack.isEmpty()||inputstack.size()==1){
            return;
        }
        //remove the topmost element
        int top = inputstack.pop();
        reverse(inputstack);
        //now we need to reverse the stack continuously
        insertionAtBottom(inputstack,top);
    }

    private static void insertionAtBottom(Stack<Integer> inputstack, int item) {
        //base case
        if(inputstack.isEmpty()){
            inputstack.push(item);
            return;
        }
        //if the stack is not empty we need remove previous elements
        int topmost = inputstack.pop();
        insertionAtBottom(inputstack,item);
        inputstack.push(topmost);

    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        reverse(stack);
        for (int element:stack){
            System.out.print(element+" ");
        }

    }
}
