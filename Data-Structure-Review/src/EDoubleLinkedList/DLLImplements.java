package EDoubleLinkedList;

public class DLLImplements<T> implements DLLInterface<T> {
    //Declare variables
    private Node<T> head; //It is the first node
    private Node<T> tail; //It is the last node
    private int size; //The number of element in the list

    //Create end declare the constructor
    public DLLImplements() {
        head = null;
        tail = null;
        size = 0;
    }

    //Development of Methods from List.java
    //Check if it s empty
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    //Check the size
    @Override
    public int size() {
        return size;
    }

    //Add element
    @Override
    public void add(T elem) {//function-add(T - type of variable; element - variable)
        Node<T> newNode = new Node<>(elem, null, tail);//Declare a new Node
        if (tail != null) {//Last element different from null(The list already has element)
            tail.setNext(newNode);//Put element in the end of list
        } else {
            head = newNode;//List is empty, put element in the first position
        }
        tail = newNode;
        size++;
    }

    //AddBefore
    @Override
    public void addBefore(T target, T elem) {
        Node<T> current = head;//Declare a node

        while (current != null && !current.getElement().equals(target)) {//Find the position of current
            current = current.getNext();
        }

        if (current == null) {//Did not find, print
            throw new IllegalArgumentException("Target element not found.");
        }

        Node<T> newNode = new Node<>(elem, current, current.getPrev());//Declare a new node
        if (current.getPrev() != null) {//if there is a valid before current
            current.getPrev().setNext(newNode);//
        } else {
            head = newNode;
        }
        current.setPrev(newNode);
        size++;
    }

    @Override
    public void addAfter(T target, T elem) {
        Node<T> current = head;

        while (current != null && !current.getElement().equals(target)) {
            current = current.getNext();
        }

        if (current == null) {
            throw new IllegalArgumentException("Target element not found.");
        }

        Node<T> newNode = new Node<>(elem, current.getNext(), current);
        if (current.getNext() != null) {
            current.getNext().setPrev(newNode);
        } else {
            tail = newNode;
        }
        current.setNext(newNode);
        size++;
    }

    @Override
    public T remove(T target) {
        Node<T> current = head;

        while (current != null && !current.getElement().equals(target)) {
            current = current.getNext();
        }

        if (current == null) {
            throw new IllegalArgumentException("Target element not found.");
        }

        if (current.getPrev() != null) {
            current.getPrev().setNext(current.getNext());
        } else {
            head = current.getNext();
        }

        if (current.getNext() != null) {
            current.getNext().setPrev(current.getPrev());
        } else {
            tail = current.getPrev();
        }

        size--;
        return current.getElement();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<T> current = head;
        while (current != null) {
            sb.append(current.getElement()).append(" <-> ");
            current = current.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
