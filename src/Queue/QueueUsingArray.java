package Queue;

import java.util.Queue;

public class QueueUsingArray {
    static class Queue{
        static int arr[];
        static int size;
        static int rear = -1;
      Queue(int n){
            arr = new int[n];
            this.size = n;
        }
        //enqueue------->Add Operation
        public static void add(int data){
          if(rear==size-1){
              System.out.println("Queue is Full...!");
              return;
          }
          else{
              rear++;
              arr[rear] = data;
          }
        }
        //dequeue operation------->remove operation
        public static int remove(){
          if(isEmpty()){
              System.out.println("Queue is empty");
              return -1;
          }
          //shift all the at its back position
            int front = arr[0];//return the first element added according to the FIFO structure
            for (int i=0;i<rear;i++){
                arr[i] = arr[i+1];
            }
            rear--;
            return front;
        }
        //peek function
        public static int peek(){
          if(isEmpty()){
              System.out.println("Queue is Empty");
              return -1;
          }
          return arr[0];
        }
        //check the queue empty or not
        public static boolean isEmpty(){
          if(rear==-1)
              return true;
          else
              return false;

        }
    }
    public static void main(String[] args) {
        Queue queue = new Queue(5);
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        while (!queue.isEmpty()){
            System.out.print(" "+queue.peek());
            queue.remove();
        }

    }
}
