package CQueue;

import java.util.ArrayList;
import java.util.List;

public class QueueImpl<T> implements QueueInterfaceADT<T> {
    private List<T> queue;

    public QueueImpl() {
        queue = new ArrayList<>();
    }

    @Override
    public void enqueue(T element) {
        queue.add(element);  // Add element to the end of the queue
    }

    @Override
    public T dequeue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.remove(0); // Remove element from the front (FIFO)
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        return queue.get(0); // Get the first element
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();
    }

    @Override
    public int size() {
        return queue.size();
    }

    @Override
    public List<T> getQueueElements() {
        return new ArrayList<>(queue);
    }
}

