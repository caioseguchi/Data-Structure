package ArrayList;

import java.util.Comparator;
import java.util.Objects;

public class Person implements Comparable<Person>{
    //Variables
    private String name;
    private String lastName;
    private int age;

    //Constructor
    public Person(String name, String lastName, int age) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
    }

    //Getters and Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    //toString
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return this.getName().compareToIgnoreCase(person.getName());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person person)) return false;
        return age == person.age && Objects.equals(name, person.name) && Objects.equals(lastName, person.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age);
    }
}

class ComparatorAge implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class ComparatorLastName implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getLastName().compareToIgnoreCase(o2.getLastName());
    }
}

class ComparatorNameLastnameAge implements Comparator<Person>{
    @Override
    public int compare(Person o1, Person o2) {
        int name = o1.getName().compareToIgnoreCase(o2.getName());
        if (name != 0) return name;

        int lastName = o1.getLastName().compareToIgnoreCase(o2.getLastName());
        if (lastName != 0) return lastName;

        return Integer.compare(o1.getAge(), o2.getAge());
    }
}