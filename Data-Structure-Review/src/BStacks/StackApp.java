package BStacks;

import java.time.LocalDate;

public class StackApp {
    public static void main(String[] args) {
        StackInterfaceADT<Student> studentStack = new StackImpl<>();

        // Creating Student objects
        Student s1 = new Student("Alice", "10A", LocalDate.of(2005, 5, 15));
        Student s2 = new Student("Bob", "10B", LocalDate.of(2006, 6, 10));
        Student s3 = new Student("Charlie", "10C", LocalDate.of(2007, 7, 20));

        // Pushing students onto the stack
        studentStack.push(s1);
        studentStack.push(s2);
        studentStack.push(s3);

        // Printing all students
        System.out.println("Stack Elements:");
        for (Student s : studentStack.getStackElements()) {
            System.out.println(s);
        }

        // Checking top element
        System.out.println("\nTop Student: " + studentStack.peek());

        // Removing a student (LIFO behavior)
        System.out.println("\nPopped: " + studentStack.pop());

        // Checking stack size
        System.out.println("\nStack size after pop: " + studentStack.size());
    }
}
