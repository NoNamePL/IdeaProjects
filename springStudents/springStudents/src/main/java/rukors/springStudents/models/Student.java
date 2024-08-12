package rukors.springStudents.models;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Data
@Builder
//@Entity
public class Student {
//    @Id
//    @GeneratedValue
    private long id;
    private String name;
    private String lastName;
    private LocalDate dateOfBirth;
//    @Column(unique = true)
    private String email;
//    @Transient
    private int age;

    // Constructors, getters, setters, toString()...
//    public Student() {
//        name = "Empty";
//        lastName = "Empty";
//        dateOfBirth = LocalDate.now();
//        email = "empty@example.com";
//        age = 0;
//    }
//
//    public Student(String name, String lastName, LocalDate dateOfBirth, String email, int age) {
//        this.name = name;
//        this.lastName = lastName;
//        this.dateOfBirth = dateOfBirth;
//        this.email = email;
//        this.age = age;
//    }
//
//    public Student(String name, String lastName, int age) {
//        this.name = name;
//        this.lastName = lastName;
//        this.age = age;
//        this.email = "empty@example.com";
//    }
//
//    public Student(String name, String lastName, String email, int age) {
//        this.name = name;
//        this.lastName = lastName;
//        this.email = email;
//        this.age = age;
//    }
//
//    public Student(String name, String lastName, String email) {
//        this.name = name;
//        this.lastName = lastName;
//        this.email = email;
//    }
//
//    public Student(String name, String lastName) {
//        this.name = name;
//        this.lastName = lastName;
//    }
//
//    public Student(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
//    public Student(String name, int age, String email) {
//        this.name = name;
//        this.age = age;
//        this.email = email;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String getLastName() {
//        return lastName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }
//
//    public LocalDate getDateOfBirth() {
//        return dateOfBirth;
//    }
//
//    public void setDateOfBirth(LocalDate dateOfBirth) {
//        this.dateOfBirth = dateOfBirth;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//
//    public String getFullName() {
//        return name + " " + lastName;
//    }
}
