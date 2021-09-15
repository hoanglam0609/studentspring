package com.hoanglam.studentspringjpa.service;

import com.hoanglam.studentspringjpa.entity.Student;

public interface StudentService {
    public void saveStudent(Student student);
    public Student getStudent(int id);
    public void update(Student student);
    public void delete(Student student);
}
