package BStacks;

import java.time.LocalDate;

//Object Class
public class Student {
    //Variables
    private String name;
    private String studentClass;
    private LocalDate dateOfBirth;


    //Constructor
    public Student(String name, String studentClass, LocalDate dateOfBirth) {
        this.name = name;
        this.studentClass = studentClass;
        this.dateOfBirth = dateOfBirth;
    }

    //Getters and Setter
    public String getName() {
        return name;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    //ToStrig
    @Override
    public String toString() {
        return "Student{" +
                "Name='" + name + '\'' +
                ", Class='" + studentClass + '\'' +
                ", DateOfBirth=" + dateOfBirth +
                '}';
    }
}
