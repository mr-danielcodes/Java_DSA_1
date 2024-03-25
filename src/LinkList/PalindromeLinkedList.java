package LinkList;

import java.util.LinkedList;

public class PalindromeLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.addFirst("D");
        list.addLast("A");
        list.addLast("N");
        list.addLast("I");
        list.addLast("E");
        list.addLast("L");
        String arr[] = new String[list.size()]; // Creating array with the size of the linked list

        for(int i = 0; i <list.size(); i++) {
            arr[i] = list.get(i);// Populating the array with elements from the linked list
        }

        for(String element : arr) {
            System.out.print(element + "->"); // Printing the elements of the array
        }
    }
}
