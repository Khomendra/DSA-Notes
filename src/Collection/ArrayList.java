package Collection;

import java.util.Iterator;
import java.util.List;

public class ArrayList {
    public static void main(String []args){
        List<String> list = new java.util.ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Mango");
        list.add("Orange");
        list.add("WaterMelon");

//        1. Iteration using normal way
//        System.out.println("List of Fruits: "+list);
//        System.out.println("List at 2nd position: "+list.get(1));
//        System.out.println("Change: "+list.set(4, "Papaya"));
//        System.out.println("List pf Fruits: "+list);

//        2. Iteration using enhanced for loop
//        for (String fruit : list){
//            System.out.println("List: "+fruit);
//        }

//        3. Iteration using forEach loop
//        list.forEach(
//                (fruit) -> {
//                    System.out.println(fruit);
//                }
//        );

//        4. Iteration using Iterator
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()){
//            String fruit = iterator.next();
//            System.out.println(fruit);
//        }

//        Convert List to Array using String []array = list.toArray(new String[list.size()]);
//        How to sort the List? Collections.sort(list);
    }
}
