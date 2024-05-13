// question 3
public class Main {
    public static void main(String[] args) {
        // Create a queue with size 5
        QueueUsingStacks queue = new QueueUsingStacks(5);

        // Enqueue some items
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);

        // Dequeue some items
        System.out.println("Dequeued is " + queue.dequeue());
        System.out.println("Dequeued is " + queue.dequeue());

        // Peek at the front item
        System.out.println("Front is " + queue.peek());
    }
}