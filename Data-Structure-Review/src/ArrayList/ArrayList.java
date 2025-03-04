package ArrayList;

import java.util.Collections;
import java.util.List;

public class ArrayList {
    public static void main(String[] args) {
        //Create and declare ArrayList of Objects
        List<Person> list = new java.util.ArrayList<Person>();

        //Add new person in the list
        Person p1 = new Person("Caio", "Seguchi", 32);//create a new person
        list.add(p1);

        //or
        list.add(new Person("Luci", "Souza", 27));
        list.add(new Person("Juan", "Verde", 25));
        list.add(new Person("Laura", "Verde", 23));
        list.add(new Person("Lucas", "Santos", 28));
        list.add(new Person("Laura", "Rodriguez", 30));
        list.add(new Person("Lucas", "Seguchi", 75));

        //Print all list
        System.out.println("Order List");
        System.out.println(list.toString());//Print with toString
        System.out.println();

        for (int i = 0; i < list.size(); i++) {//Print with for
            System.out.println(list.get(i));
        }
        System.out.println();

        //Print Shuffle list
        System.out.println("Shuffle list");
        Collections.shuffle(list);
        System.out.println(list.toString());//Print with toString
        System.out.println();

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
