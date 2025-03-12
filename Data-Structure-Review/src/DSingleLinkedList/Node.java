package DSingleLinkedList;
//Node
public class Node<T>{
    //Variable
    private T element;
    private Node<T> next;

    //Constructor
    public Node(T element, Node<T> next) {
        this.element = element;
        this.next = next;
    }

    //Getter and Setters
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
}//class
