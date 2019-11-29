import java.util.*;

public class QueueInterfaceDemo {
    public static void main(String[] args) {
        Queue<Integer> queue =new LinkedList<>();
        //add remove element exception
        //poll peek offer null/ boolean

        queue.add(1);
        queue.offer(33);
        queue.add(-11);
        System.out.println("queue :"+queue);
        System.out.println("queue first element:"+queue.peek());
        System.out.println("queue poped element:"+queue.poll());
        System.out.println("queue after poll:"+queue);
        System.out.println("queue first element :"+queue.element());
        System.out.println("queue popped element :"+queue.remove());
        System.out.println("queue after poping:"+queue);
        queue.poll();
        System.out.println("using peek on empty queue gives:"+queue.peek());


      //priorityQueue
        //minHeap algo
        Queue<Integer> pQ =new PriorityQueue<>();
        pQ.add(100);
        pQ.add(77);
        pQ.add(33);
        pQ.add(44);
        pQ.add(80);
        pQ.add(55);
        pQ.add(66);
        //pQ.add(1);
        System.out.println("PriorityQueue:"+pQ);
        System.out.println("PriorityQueue first element"+pQ.peek());
        System.out.println("Priority poped element:"+pQ.poll());
        //BlockingQueue



    }
}
