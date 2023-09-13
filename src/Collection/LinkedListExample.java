package Collection;

import java.util.Iterator;
import java.util.List;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String []args){
        List<String> names = new java.util.LinkedList<>();
        names.add("Ravi");
        names.add("Krishna");
        names.add("Tarun");
        names.add("Raaghav");
        names.add("Ishaan");

//        Iteration
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            String name = iterator.next();
//            System.out.println(name);
//        }

        //One LinkedList can add to another LinkedList using addAll() method
        //eg. names.remove("Tarun");
        //list1.removeAll(list2)
        //list.removeFirst();
        //list.removeLast();
        //list.removeFirstOccurrence("Gaurav");
        //list.removeLastOccurrence("Ajit");
        //list.clear();

//        Traversing the List of Elements in Reverse order
//        LinkedList<String> threeNames = new LinkedList<>();
//        threeNames.add("Amit");
//        threeNames.add("Ajay");
//        threeNames.add("Arun");
//        Iterator reverseOrder = threeNames.descendingIterator();
//        while (reverseOrder.hasNext()){
//            System.out.println(reverseOrder.next());
//        }

//        Difference between ArrayList and LinkedList
    }
}
