package StackQuestions;

import java.util.Stack;

public class Basic_StackOperations {
    //push operation
    public static void stackPush(Stack<Integer> stack){
        for(int i=0;i<5;i++){
            stack.push(i);
        }
    }
    //pop operation
    public static void stackPop(Stack<Integer> stack){
        for(int i = 0;i<5;i++){
            int x = (Integer) stack.pop();
            System.out.print(x);
        }
        System.out.println();
    }
    //peek operation
    public static void stackPeek(Stack<Integer> stack){
        int x = (Integer) stack.peek();
        System.out.println(x);
    }
    //searching element in stack
    public  static void searchStack(Stack<Integer> stack,int element){
        int x = (Integer) stack.search(element);
        if(x==-1)
            System.out.println("Element not found");
        else
            System.out.println("Element is found at position"+ x);
    }
    //checking stack is empty or not
    public static void stackEmpty(Stack<Integer> stack){
        boolean isEmpty = stack.isEmpty();
        if(isEmpty)
            System.out.println("Stack is Empty");
        else
            System.out.println("Stack is not Empty");
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stackPush(stack);
        stackPeek(stack);
        stackEmpty(stack);
        searchStack(stack,2);
        searchStack(stack,6);
        stackPop(stack);
    }
}
