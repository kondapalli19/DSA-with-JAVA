import java.util.*;

public class InbuiltJava {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();

        stack.push(34);
        stack.push(14);
        stack.push(90);
        stack.push(89);
        stack.push(12);

        System.out.println("Stack");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println();

        Queue<Integer> queue=new LinkedList();
        
        queue.add(34);
        queue.add(14);
        queue.add(90);
        queue.add(89);
        queue.add(12);

        System.out.println("Queue");
        System.out.println(queue.peek());

        System.out.println(queue.remove());
        System.out.println(queue.remove());
        System.out.println();

        Deque<Integer> deque=new ArrayDeque<>();

        System.out.println("Dequeue");
        deque.add(90);
        deque.addFirst(34);
        System.out.println(deque.removeLast());
        
    }
}
