package Collection;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String []args){

//        Normal flow
//        Set<String> names = new TreeSet<>();
//        names.add("Uday");
//        names.add("Poonam");
//        names.add("Ashish");
//        Iterator iterator = names.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        Traversing in Descending order
//        TreeSet<String> names = new TreeSet<>();
//        names.add("Uday");
//        names.add("Poonam");
//        names.add("Ashish");
//        Iterator iterator = names.descendingIterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//         Retrieve and remove the highest and lowest Value.
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(43);
        numbers.add(65);
        numbers.add(87);
        numbers.add(32);
        numbers.add(55);
        System.out.println("Lowest value: "+numbers.pollFirst());
        System.out.println("Highest value: "+numbers.pollLast());
    }
}
