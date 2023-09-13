package Collection;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String []args){

//        Normal Program
//        Set<String> names = new LinkedHashSet<>();
//        names.add("Rohit");
//        names.add("Rama");
//        names.add("Rahul");
//        Iterator<String> iterator = names.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        LinkedHashSet ignoring duplicate elements
        Set<String> names = new LinkedHashSet<>();
        names.add("Rohit");
        names.add("Rama");
        names.add("Rahul");
        names.add("Rama");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        Removing element names.remove("Rohit");
    }
}
