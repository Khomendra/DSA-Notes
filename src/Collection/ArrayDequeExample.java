package Collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

    public static void main(String []args){

//        Normal flow of Deque
//        Deque<String> deque = new ArrayDeque<>();
//        deque.add("Ravi");
//        deque.add("Vijay");
//        deque.add("Ajay");
//        System.out.println("Deque Result: ");
//        for (String str : deque){
//            System.out.println(str);
//        }

        Deque<String> deque = new ArrayDeque<>();
        deque.offer("Arvind");
        deque.offer("Vimal");
        deque.offer("Mukul");
        deque.offerFirst("Jai");
        System.out.println("After offerFirst Traversal: ");
        for (String str : deque){
            System.out.println(str); //Jai, Arvind, Vimal, Mukul
        }

        deque.poll();
        deque.pollFirst(); //poll and pollFirst are same
        deque.pollLast();
        System.out.println("After poll: ");
        for (String str : deque){
            System.out.println(str);
        }
    }
}
