public class QueueMain {
    public static void main(String[] args)throws Exception {
        CustomQueue queue=new CustomQueue(5);

        queue.insert(90);
        queue.insert(78);
        queue.insert(0);
        queue.insert(34);
        queue.insert(12);

        queue.display();

        System.out.println(queue.front());

        System.out.println(queue.remove());
        System.out.println(queue.remove());

        queue.display();

        System.out.println();

        CircularQueue queue1=new CircularQueue(5);
        
        System.out.println("Circular Queue");

        queue1.insert(12);
        queue1.insert(23);
        queue1.insert(90);
        queue1.insert(78);
        queue1.insert(0);
        queue1.insert(34);

        queue1.display();
        System.out.println(queue1.front());

        System.out.println(queue1.remove());
        queue1.display();

        System.out.println(queue1.remove());
        queue1.display();

        System.out.println();

        DynamicQueue queue11=new DynamicQueue(5);
        
        System.out.println("Dynamic Queue");

        queue11.insert(23);
        queue11.insert(90);
        queue11.insert(78);
        queue11.insert(0);
        queue11.insert(34);
        queue11.insert(12);
        queue11.insert(34);
        queue11.insert(90);

        queue11.display();
        System.out.println(queue11.front());

        System.out.println(queue11.remove());
        queue11.display();

    }
}
