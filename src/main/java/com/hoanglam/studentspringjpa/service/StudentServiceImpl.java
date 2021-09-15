package com.hoanglam.studentspringjpa.service;

import com.hoanglam.studentspringjpa.dao.StudentRepository;
import com.hoanglam.studentspringjpa.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Optional;

public class StudentServiceImpl implements StudentService{

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void saveStudent(Student student) {
        studentRepository.saveStudent(student.getName(),student.getAge(),student.getPhone(),student.getAddress(),student.getJob());
    }

    @Override
    public Student getStudent(int id) {
        Student student = studentRepository.findStudentById(id);
        return student;
    }

    @Override
    public void update(Student student) {
        studentRepository.updateStudent(student.getId(), student.getName(), student.getAge(), student.getPhone(), student.getAddress(), student.getJob());
    }

    @Override
    public void delete(Student student) {
        studentRepository.deleteStudent(student.getId());
    }
}
