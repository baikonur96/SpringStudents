package by.exp.springStudents.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
public class Student {
    private String firstName;
    private String lastname;
    private LocalDate dateOfBirth;
    private String email;
    private int age;
}
