package Collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExample {
    public static void main(String []args){

//        Normal flow
//        Set<String> setOfName = new HashSet<>();
//        setOfName.add("Tina");
//        setOfName.add("Tanu");
//        setOfName.add("Reshma");
//        Iterator<String> iterator = setOfName.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }

//        HashSet ignoring duplicate Elements
        Set<String> setOfName = new HashSet<>();
        setOfName.add("Tina");
        setOfName.add("Tanu");
        setOfName.add("Reshma");
        setOfName.add("Tina");
        setOfName.removeIf(str -> str.contains("Reshma"));
        Iterator<String> iterator = setOfName.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        setOfNames.remove("Tanu");
//        set1.removeAll(set2);
//        set1.addAll(set2);
//        set1.removeIf(str -> str.contains("Reshma"));
//        set1.clear();
//        Can add List in HashSet like;
//              eg.  List<String> list=new ArrayList<String>();  //one, two, three, four
//                   Set<String> set = new HashSet(list);
//                   set.add("five")
//                   sout(set); //one, two, three, four, five
    }
}
