package AArrayList;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        // Step 1: Create an ArrayList to store Person instances
        List<Person> list = new ArrayList<>();

        // Step 2: Add instances of Person to the ArrayList
        list.add(new Person("Caio", "Seguchi", 32));
        list.add(new Person("Luci", "Souza", 27));
        list.add(new Person("Caio", "Ghil", 25));
        list.add(new Person("Laura", "Santana", 23));
        list.add(new Person("Lucas", "Pontes", 23));


        System.out.println("List of Persons: " + list);
        System.out.println("-------------------");

        // Retrieve and print a person at index 1
        System.out.println("Person at index 1: " + list.get(1));
        System.out.println("-------------------");

        // Remove the person at index 3
        list.remove(3);
        System.out.println("List after removing index 3: " + list);
        System.out.println("-------------------");

        // Print the size of the ArrayList
        System.out.println("The size of the list is: " + list.size());
        System.out.println("-------------------");

        // Set a new person at index 3
        list.set(3, new Person("Bia", "Seguchi", 34));
        System.out.println("Updated list after setting index 3: " + list);
        System.out.println("-------------------");

        // Check if a specific person exists in the list
        Person personToFind = new Person("Bia", "Seguchi", 34);
        boolean exists = list.contains(personToFind);
        System.out.println("Does " + personToFind + " exist in the list? " + exists);
        System.out.println("-------------------");

        // Check if the list contains a person with specific attributes
        boolean hasName = list.stream().anyMatch(p -> p.getName().equals("Bia"));
        boolean hasAge = list.stream().anyMatch(p -> p.getAge() == 50);
        boolean hasLastName = list.stream().anyMatch(p -> p.getLastName().equals("Seguchi"));

        System.out.println("Does the list contain a person named 'Bia'? " + hasName);
        System.out.println("Is there someone aged 50? " + hasAge);
        System.out.println("Does the list contain someone with last name 'Seguchi'? " + hasLastName);
        System.out.println("-------------------");

        // Print all people with the last name "Seguchi"
        if (hasLastName) {
            System.out.println("People with last name 'Seguchi':");
            list.stream()
                    .filter(p -> p.getLastName().equals("Seguchi"))
                    .forEach(System.out::println);
        }
        System.out.println("-------------------");

        // Shuffle the list
        Collections.shuffle(list);
        System.out.println("Shuffled list: " + list);
        System.out.println("-------------------");

        // Sort the list using Comparable (assumes Person implements Comparable)
        System.out.println("Sorted by name (Comparable):");
        Collections.sort(list);
        System.out.println(list);
        System.out.println("-------------------");

        // Sort by Age using Comparator
        System.out.println("Sorted by Age (Comparator):");
        list.sort(new ComparatorAge());
        System.out.println(list);
        System.out.println("-------------------");

        // Sort by Last Name using Comparator
        System.out.println("Sorted by Last Name (Comparator):");
        list.sort(new ComparatorLastName());
        System.out.println(list);
        System.out.println("-------------------");

        // Sort by Name, Last Name, and Age using Comparator
        System.out.println("Sorted by Name/Last Name/Age (Comparator):");
        list.sort(new ComparatorNameLastnameAge());
        System.out.println(list);
    }
}
