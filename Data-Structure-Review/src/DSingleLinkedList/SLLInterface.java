package DSingleLinkedList;
//Repository
public interface SLLInterface<T> {
    boolean isEmpty();
    int size();
    T get(int index);
    void remove(int index);
    void add(T element, int index);
    void add(T element);
    void printList();
}
