package DSingleLinkedList;
//Server
public class SLLImplement<T> implements SLLInterface<T> {
    //Variables
    private Node<T> head;
    private Node<T> curNode;
    private Node<T> prevNode;
    private int size;

    //Constructor
    public SLLImplement() {
        head = null;
        curNode = head;
        prevNode = null;
        size = 0;
    }

    //Develop Methods
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public T get(int index) {
        setCurrent(index);
        return curNode.getElement();
    }

    @Override
    public void remove(int index) {
        if (index == 1) {
            head = head.getNext();
        } else {
            setCurrent(index);
            prevNode.setNext(curNode.getNext());
        }
        size--;
    }

    @Override
    public void add(T element, int index) {
        if (index == 1) {
            Node<T> newNode = new Node<>(element, head);
            head = newNode;
        } else {
            setCurrent(index);
            Node<T> newNode = new Node<>(element, curNode);
            prevNode.setNext(newNode);
        }
        size++;
    }

    @Override
    public void add(T element) {
        add(element, size + 1);
    }

    @Override
    public void printList() {
        Node<T> currentNode = head;
        while (currentNode != null) {
            System.out.println(currentNode.getElement().toString());
            currentNode = currentNode.getNext();
        }
    }

    private void setCurrent(int index) {
        int count;
        prevNode = null;
        curNode = head;
        for (count = 1; count < index; count++) {
            prevNode = curNode;
            curNode = curNode.getNext();
        }
    }

}//class
