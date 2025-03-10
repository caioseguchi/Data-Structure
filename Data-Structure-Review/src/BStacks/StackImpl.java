package BStacks;

import java.util.ArrayList;
import java.util.List;

public class StackImpl<T> implements StackInterfaceADT<T> {
    private List<T> stack;//Declares a private instance variable stack, which is a generic list (List<T>).

    //Constructor for StackImpl<T>
    public StackImpl() {
        stack = new ArrayList<>();
    }

    //Develop methods of StackInterfaceADT
    @Override
    public void push(T element) {
        stack.add(element);
    }

    @Override
    public T pop() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.remove(stack.size() - 1);
    }

    @Override
    public T peek() {
        if (isEmpty()) {
            throw new RuntimeException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    @Override
    public int size() {
        return stack.size();
    }

    @Override
    public List<T> getStackElements() {
        return new ArrayList<>(stack);
    }
}
