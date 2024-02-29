package by.exp.springStudents.repository;

import by.exp.springStudents.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
    void deleteByEmail(String email);
    Student findStudentByEmail(String email);

}
