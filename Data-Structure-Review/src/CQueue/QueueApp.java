package CQueue;

public class QueueApp {
    public static void main(String[] args) {
        QueueInterfaceADT<Cat> catQueue = new QueueImpl<>();

        // Creating Cat objects
        Cat cat1 = new Cat("Whiskers", "Black", 3);
        Cat cat2 = new Cat("Mittens", "White", 2);
        Cat cat3 = new Cat("Shadow", "Gray", 4);

        // Adding cats to the queue
        catQueue.enqueue(cat1);
        catQueue.enqueue(cat2);
        catQueue.enqueue(cat3);

        // Printing all cats in the queue
        System.out.println("Queue Elements:");
        for (Cat c : catQueue.getQueueElements()) {
            System.out.println(c);
        }

        // Checking the first cat in the queue
        System.out.println("\nFirst Cat: " + catQueue.peek());

        // Removing a cat (FIFO behavior)
        System.out.println("\nDequeued: " + catQueue.dequeue());

        // Checking queue size after removal
        System.out.println("\nQueue size after dequeue: " + catQueue.size());
    }
}
