package by.exp.springStudents.controller;

import by.exp.springStudents.model.Student;
import by.exp.springStudents.service.StudentService;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController //ResponseBody and формирует ответ в JSON
@RequestMapping("api/v1/students")
@AllArgsConstructor
public class StudentController {

    private StudentService service;

    @GetMapping
    public List<Student> findAllStudent() {
        return service.findAllStudent();
    }
}
