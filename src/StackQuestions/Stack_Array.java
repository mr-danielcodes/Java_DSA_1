package StackQuestions;

public class Stack_Array {
    int arr[];
    int top = -1;
    int capacity;
    public Stack_Array(int capacity){
        this.capacity = capacity;
        top = -1;
        arr = new int[capacity];
    }
    //push
    public void pushStack(int data) throws Exception {
        if(top == capacity-1)
            System.out.println("Stack is Full");
        top++;
        arr[top] = data;
    }
    //pop
    public int popStack(){
        //check the stack empty or not
        if(top==-1)
            System.out.println("Stack is Empty");
        int result = arr[top];
        return result;
    }
    //peek
    public int peekStack(){
        if(top==-1)
            System.out.println("Stack is empty");
        int topElement = arr[top];
        return  topElement;
    }
    //stack size check
    public boolean isEmpty(){
        if (top==-1)
            return true;
        else
            return false;
    }
    public static void main(String[] args) {
        //In this actually we implement the stack without the library files
    }
}
