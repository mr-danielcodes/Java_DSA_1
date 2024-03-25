package Queue;
import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.Stack;

public class QueueUsing2Stacks {
    static class MyQueue {
        static Stack<Integer> tempStack = new Stack<>();
        static Stack<Integer> inputStack = new Stack<>();

        // Enqueue
        public static void add(int data) {
            while (!tempStack.isEmpty()) {
                inputStack.push(tempStack.pop());
            }
            inputStack.push(data);
        }

        // Peek
        public static int peek() {
            if (inputStack.isEmpty() && tempStack.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            if (tempStack.isEmpty()) {
                while (!inputStack.isEmpty()) {
                    tempStack.push(inputStack.pop());
                }
            }
            return tempStack.peek();
        }

        // Dequeue
        public static int remove() {
            if (inputStack.isEmpty() && tempStack.isEmpty()) {
                throw new IllegalStateException("Queue is empty");
            }
            if (tempStack.isEmpty()) {
                while (!inputStack.isEmpty()) {
                    tempStack.push(inputStack.pop());
                }
            }
            return tempStack.pop();
        }
    }
    public static void main(String[] args) {
        MyQueue.add(1);
        MyQueue.add(2);
        MyQueue.add(3);

        System.out.println("Removed the First Element: "+MyQueue.remove());
        System.out.println("Top Most Element: "+MyQueue.peek());
    }

}
