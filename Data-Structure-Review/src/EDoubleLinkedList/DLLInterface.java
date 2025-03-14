package EDoubleLinkedList;

public interface DLLInterface<T> {
    boolean isEmpty();// Check if it is empty
    int size(); //Check the size
    void add(T elem); //add element
    void addBefore(T target, T elem); //add element before
    void addAfter(T target, T elem); //add element after
    T remove(T target);// remove element
}
