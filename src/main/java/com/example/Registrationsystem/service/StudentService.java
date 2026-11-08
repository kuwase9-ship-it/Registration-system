package com.example.Registrationsystem.service;

import com.example.Registrationsystem.model.Student;
import com.example.Registrationsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    private final StudentRepository repository;

    public StudentService(StudentRepository repository) {
        this.repository = repository;
    }

    public List<Student> getAllStudents() {
        return repository.findAll();
    }

    public Student saveStudent(Student student) {
        return repository.save(student);
    }

    public Student getStudentById(int id) {
        return repository.findById(id).orElse(null);
    }

    public void deleteStudent(int id) {
        repository.deleteById(id);
    }
}