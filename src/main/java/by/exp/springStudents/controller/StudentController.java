package by.exp.springStudents.controller;

import by.exp.springStudents.model.Student;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //ResponseBody and формирует ответ в JSON
@RequestMapping("api/v1/students")
public class StudentController {

    @GetMapping
    public List<Student> findAllStudent() {
        return List.of(
                Student.builder().firstName("Oleg").email("oleg12@lol.com").age(24).build(),
                Student.builder().firstName("Alex").email("alex@lol.com").age(28).build(),
                Student.builder().firstName("John").email("john12@lol.com").age(19).build()
        );
    }
}
