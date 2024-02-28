package by.exp.springStudents.model;

import lombok.*;

import java.time.LocalDate;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}
