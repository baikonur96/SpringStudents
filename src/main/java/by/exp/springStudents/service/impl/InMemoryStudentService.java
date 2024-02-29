package by.exp.springStudents.service.impl;

import by.exp.springStudents.model.Student;
import by.exp.springStudents.repository.InMemoryStudentDAO;
import by.exp.springStudents.service.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@AllArgsConstructor
public class InMemoryStudentService implements StudentService {

    private final InMemoryStudentDAO repository;

    @Override
    public List<Student> findAllStudent() {
        return repository.findAllStudent();
    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);
    }
}
