package by.exp.springStudents.service;

import by.exp.springStudents.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StudentService {

    List<Student> findAllStudent();
    Student saveStudent(Student student);
    Student findByEmail(String email);
    Student updateStudent(Student student);
    void deleteMessage(String email);
}
