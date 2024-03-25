package LinkList;

public class ReverseLinkList {
    Node head;
    class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void insertAtHead(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        //System.out.println("Insert Successfully");
    }
    //insertion at last
    public void insertionAtTail(int data){
        Node newNode = new Node(data);
        if (head==null){
            head = newNode;
            return;
        }
        //we hold the head and traverse the whole link list and when
        //we found the last node
       Node currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }
    //Reverse the LinkedList 💂‍♀️💂‍♀️💂‍♀️
    public Node reverse(Node head){
        Node current = head;
        Node previous = null;
        while (current!=null){
            Node temp = current.next;
            current.next = previous;
            previous = current;
            current = temp;
        }
        return previous;
    }
    public void printLinkedList(){
        //check the list empty or not
        Node currentNode = head;
        while (currentNode!=null){
            System.out.print(currentNode.data+"->");
            currentNode = currentNode.next;
        }
        System.out.println("Null");//😂😂 window+.-->button for this
    }

    public static void main(String[] args) {
        ReverseLinkList list = new ReverseLinkList();
        list.insertAtHead(1);
        list.insertionAtTail(2);
        list.insertionAtTail(3);
        list.insertionAtTail(4);
        list.insertionAtTail(5);

        list.head = list.reverse(list.head);
        list.printLinkedList();
    }
}
