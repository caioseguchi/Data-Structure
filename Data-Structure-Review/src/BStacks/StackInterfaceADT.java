package BStacks;

import java.util.List;

public interface StackInterfaceADT<T> {
    void push(T element);  // Add an element to the stack
    T pop();               // Remove and return the top element
    T peek();              // Return the top element without removing
    boolean isEmpty();     // Check if stack is empty
    int size();            // Return the number of elements in stack
    List<T> getStackElements(); // Retrieve all elements
}
