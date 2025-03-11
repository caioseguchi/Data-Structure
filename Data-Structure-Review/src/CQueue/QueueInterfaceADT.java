package CQueue;

import java.util.List;

public interface QueueInterfaceADT<T> {
    void enqueue(T element);  // Add an element to the queue
    T dequeue();              // Remove and return the first element
    T peek();                 // Return the first element without removing
    boolean isEmpty();        // Check if queue is empty
    int size();               // Get the number of elements in the queue
    List<T> getQueueElements(); // Retrieve all elements

}
