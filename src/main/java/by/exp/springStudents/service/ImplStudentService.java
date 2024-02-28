package by.exp.springStudents.service;

import by.exp.springStudents.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ImplStudentService implements StudentService

{
    @Override
    public List<Student> findAllStudent() {
/*        return List.of(
                Student.builder().firstName("Oleg").email("oleg12@lol.com").age(24).build(),
                Student.builder().firstName("Alex").email("alex@lol.com").age(28).build(),
                Student.builder().firstName("John").email("john12@lol.com").age(19).build()
        );*/
    };

    @Override
    public Student saveStudent(Student student) {
        return null;
    }

    @Override
    public Student findByEmail(String email) {
        return null;
    }

    @Override
    public Student updateStudent(Student student) {
        return null;
    }

    @Override
    public void deleteMessage(String email) {

    }
}
