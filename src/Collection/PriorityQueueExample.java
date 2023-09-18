package Collection;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String []args){
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("Amit");
        priorityQueue.add("Vijay");
        priorityQueue.add("Kiran");
        priorityQueue.add("Jai");
        priorityQueue.add("Rahul");
        System.out.println("Head: "+priorityQueue.element());
        System.out.println("Head: "+priorityQueue.peek());
        System.out.println("Before Removing: ");
        Iterator iterator1 = priorityQueue.iterator();
        while (iterator1.hasNext()){
            System.out.println(iterator1.next());
        }
        priorityQueue.remove();
        priorityQueue.poll();
        System.out.println("After Removing: ");
        Iterator iterator2 = priorityQueue.iterator();
        while (iterator2.hasNext()){
            System.out.println(iterator2.next());
        }
    }
}
