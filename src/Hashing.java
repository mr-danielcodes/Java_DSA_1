import java.util.HashSet;
import java.util.Iterator;


public class Hashing {
    public static void main(String[] args) {
        /* Creating */
        HashSet<Integer> set = new HashSet<>();

        /* Insert */
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        /* Size */
        System.out.println("Size of Set is " + set.size());

        /* Traverse */
        Iterator iterator = set.iterator();
        //Hash next function
        //first iterator point to null
        //.1-> it.next()->1
        //.2-> it.next()->1->2
        //.3-> it.next()->1->2->3
        //System.out.println(iterator.next());
        //System.out.println(iterator.hasNext());//->return true or false and check nexr number exist
        //or not
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
