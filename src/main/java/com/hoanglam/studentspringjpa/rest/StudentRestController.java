package com.hoanglam.studentspringjpa.rest;

import com.hoanglam.studentspringjpa.entity.Student;
import com.hoanglam.studentspringjpa.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    @Autowired
    private StudentService studentService;

    @PostMapping("/student")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @GetMapping("/student/{id}")
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @PutMapping("/student")
    public void updateStudent(@RequestBody Student student) {
        studentService.update(student);
    }

    @DeleteMapping("/student/{id}")
    public void deleteStudent(@PathVariable int id) {
        Student student = studentService.getStudent(id);
        studentService.delete(student);
    }
}
