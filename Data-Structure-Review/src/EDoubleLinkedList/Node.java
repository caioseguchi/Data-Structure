package EDoubleLinkedList;

public class Node<T> {
    //Declare variables T - generic type
    T element;// the data
    Node<T> next; // node it is the link with current data end the next one
    Node<T> prev; // node it is the link with current data end the previous one

    //Create a constructor
    public Node(T element, Node<T> next, Node<T> prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    //Setter and getters
    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public Node<T> getPrev() {
        return prev;
    }

    public void setPrev(Node<T> prev) {
        this.prev = prev;
    }
}
