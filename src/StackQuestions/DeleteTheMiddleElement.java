package StackQuestions;

import java.util.Stack;

public class DeleteTheMiddleElement {
    public static void deleteTheMiddleElement(Stack<Integer> stack,int n){
        int count = 0;
        solve(stack,count,n);
    }
    public static void solve(Stack<Integer> inputstack,int count,int size){
        //base case
        if(count==size/2){
            inputstack.pop();
            return;
        }
        int top = inputstack.peek();
        inputstack.pop();
       //recursive call
        solve(inputstack,count+1,size);
        //add the topmost element in the stack
        inputstack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        System.out.println("Before");
        for (int element:stack){
            System.out.print(element+"  ");
        }
        deleteTheMiddleElement(stack,stack.size());
        System.out.println();
        for (int element:stack){
            System.out.print(element+"  ");
        }
    }
}
