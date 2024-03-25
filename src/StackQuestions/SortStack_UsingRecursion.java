package StackQuestions;

import java.util.Stack;

public class SortStack_UsingRecursion {
    public static void sortStack(Stack<Integer> inputStack){
        //base case
        if (inputStack.isEmpty())
            return;

        int num = inputStack.pop();
        //recursive call
        sortStack(inputStack);
        insertSortStack(inputStack, num);
    }

    public static void insertSortStack(Stack<Integer> inputStack, int num) {
        //base case
        if(inputStack.isEmpty() || inputStack.peek() > num){
            inputStack.push(num);
            return;
        }

        int top = inputStack.pop();
        //recursive call
        insertSortStack(inputStack, num);
        inputStack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        sortStack(stack);

        while (!stack.isEmpty()){
            System.out.print(" "+stack.pop());
        }
    }
}
