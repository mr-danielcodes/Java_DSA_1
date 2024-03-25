package StackQuestions;

import java.util.Queue;

public class StackUsingQueue {
    class MyStack{
        static Queue<Integer> q1,q2;
        //push
        public static void push(int data){
           while(!q1.isEmpty()){
               q2.add(q1.remove());
           }
           q1.add(data);
           while (!q2.isEmpty()){
               q1.add(q2.remove());
           }
        }
        //pop
        public static int pop(){
           return q1.remove();
        }
        //top element
        public static int peek(){
            return q1.peek();
        }
    }
    public static void main(String[] args) {
     MyStack.push(1);
     MyStack.push(2);
     MyStack.push(3);
     MyStack.push(4);
     MyStack.push(5);

     //pop
        System.out.println( MyStack.pop());
        //top most element
        System.out.println(MyStack.peek());

    }
}
