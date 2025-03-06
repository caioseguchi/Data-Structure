package ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        // Step 1 and 2 Create an ArrayList to store Person instances
        List<Person> list = new java.util.ArrayList<Person>();

        // Step 3: Add instances of Person to the ArrayList
        Person p1 = new Person("Caio", "Seguchi", 32);//create a new person
        list.add(p1);

        //or
        list.add(new Person("Luci", "Souza", 27));
        list.add(new Person("Caio", "Ghil", 25));
        list.add(new Person("Laura", "Santana", 23));
        list.add(new Person("Lucas", "Pontes", 23));


        // Step 4: Demonstrate that the ArrayList methods work the same way
        // Print the ArrayList
        System.out.println("List of Persons: " + list);
        System.out.println("-------------------");

        // Get a person from the ArrayList
        Person person = list.get(1);
        System.out.println("Person at index 1: " + person);
        System.out.println("-------------------");

        // Remove a person from the ArrayList
        list.remove(3);
        System.out.println("Remove of Persons: " + list);
        System.out.println("-------------------");

        // Get the size of the ArrayList
        System.out.println("The size of arrayList is: " + list.size());
        System.out.println("-------------------");

        //Set a person in position
        list.set(3, new Person("Bia", "Seguchi",34));
        System.out.println("List Position 3: " + list);
        System.out.println("-------------------");

        //Contains
        Person personToFind = new Person("Bia", "Seguchi", 34);
        boolean exists = list.contains(personToFind);
        System.out.println("Does " + personToFind + " exist in the list: " + exists);
        System.out.println("-------------------");

        // Verify if list has name = "Bia"
        boolean hasName = list.stream().anyMatch(p -> p.getName().equals("Bia"));

        // verify if list has someone with age = 50
        boolean hasAge = list.stream().anyMatch(p -> p.getAge() == 50);

        // verify if list has someone with lastName = "Seguchi"
        boolean hasLastName = list.stream().anyMatch(p -> p.getLastName().equals("Seguchi"));

        System.out.println("Does the list has name 'Bia'? " + hasName);
        System.out.println("Does someone is 50? " + hasAge);
        System.out.println("Does someone has last name 'Seguchi'? " + hasLastName);
        // Se existir, imprimir os detalhes das pessoas encontradas
        if (hasLastName) {
            list.stream()
                    .filter(p -> p.getLastName().equals("Seguchi")) // Filtra quem tem o sobrenome Seguchi
                    .forEach(System.out::println); // Imprime cada pessoa encontrada
        }
        System.out.println("-------------------");


        //Print Shuffle list
        Collections.shuffle(list);
        System.out.println("Shuffle list: " + list);
        System.out.println("-------------------");

        //Print Natural Order - Comparable
        System.out.println("Sort by name - Comparable");
        Collections.sort(list);
        System.out.println(list);
        System.out.println();

        //Print sort by - CompareTo Age
        System.out.println("Sort by Age - CompareTo");
        Collections.sort(list, new ComparatorAge());
        System.out.println(list);
        System.out.println();

        //Print sort by - CompareTo LastName
        System.out.println("Sort by Last Name - CompareTo");
        Collections.sort(list, new ComparatorLastName());
        System.out.println(list);
        System.out.println();

        //Print sort by - CompareTo Name/LastName/Age
        System.out.println("Sort by Name/LastName/Age - CompareTo");
        Collections.sort(list, new ComparatorNameLastnameAge());
        System.out.println(list);
        System.out.println();
    }//main
}//class
