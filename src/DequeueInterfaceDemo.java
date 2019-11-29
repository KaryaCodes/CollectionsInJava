import java.util.*;

public class DequeueInterfaceDemo {
    public static void main(String[] args) {

        Deque<Integer> deck=new LinkedList<>();//arrayDequeue;
        deck.addFirst(11);
        deck.addLast(22);
        deck.add(33);
        System.out.println("Dequeue: "+deck);
        System.out.println("Dequeue first element: "+deck.peek());
        System.out.println("Dequeue first element: "+deck.peekFirst());
        System.out.println("Dequeue last element: "+deck.peekLast());
        System.out.println("Popped first element:"+deck.pollFirst());
        System.out.println("Dequeue after popping: "+deck);
        System.out.println("Dequeue popping last element: "+deck.pollLast());


        //deck.pollLast();

        deck.add(1);
        deck.add(2);
        deck.add(1);
        deck.add(2);
        System.out.println("Dequeue before: "+deck);
        deck.removeFirstOccurrence(1);
        System.out.println("Dequeue after removing first occurrence of 1: "+deck);
        deck.removeLastOccurrence(2);
        System.out.println("Dequeue after removing last occurrence of 2: "+deck);

    }
}
