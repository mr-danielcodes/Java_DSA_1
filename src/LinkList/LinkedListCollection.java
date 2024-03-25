package LinkList;
import java.util.*;

public class LinkedListCollection {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(3,90);
        list.removeFirst();
        System.out.println(list.size());
        System.out.print(list);
    }
}
