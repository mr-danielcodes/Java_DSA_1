package LinkList;

public class LinkList {
    private int length;
    LinkList(){
        this.length = 0;
    }
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            next = null;
            length++;
        }

    }
    Node head;
    //insertion at first
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
    //Insertion at specific index
    public void insertAtSpecificIndex(int data, Node head, int position) {
        //👌🌹
        Node newNode = new Node(data);

        // If position is 1, insert at the beginning
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }

        // Traverse to the node before the insertion position
        Node previousNode = head;
        for (int i = 1; i < position - 1 && previousNode != null; i++) {
            previousNode = previousNode.next;
        }

        // If position is greater than the list length, insert at the end
        if (previousNode == null) {
            System.out.println("Index Out Of Bounds");
            return;
        }

        newNode.next = previousNode.next;
        previousNode.next = newNode;
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
    //delete first Node
    public void deleteFirstNode(){
        //👮‍♂️🚔 pakrr k le gai first Node ko
        if(head==null) {
            System.out.println("List is Empty");
            return;
        }
        length--;
        head = head.next;
    }
    //delete Last Node
    public void deleteLastNode(){
        //if list is empty
        if (head==null){
            System.out.println("List is Empty");
            return;
        }
        //if list have only one element
        length--;
        if(head.next==null){
            head=null;
            return;
        }
        Node lastNode = head.next;
        Node secondLast = head;
        while(lastNode!=null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    public int getLength(){
       return length;
    }
    public static void main(String[] args) {
        LinkList linkList = new LinkList();
        linkList.insertAtHead(1);
        //linkList.insertionAtTail(2);
        //linkList.insertionAtTail(3);
        //linkList.insertionAtTail(4);
       // linkList.insertionAtTail(5);
        //linkList.printLinkedList();
        //linkList.deleteLastNode();
        linkList.insertAtSpecificIndex(6, linkList.head, 2);
        linkList.printLinkedList();
        System.out.println(linkList.getLength());
    }
}
