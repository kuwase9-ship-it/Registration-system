package com.example.Registrationsystem.service;

import com.example.Registrationsystem.model.Student;
import com.example.Registrationsystem.repository.StudentRepository;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {
    private final StudentRepository repo;

    public StudentService(StudentRepository repo) {
        this.repo = repo;
    }

    public List<Student> getAll() {
        return repo.findAll();
    }

    public void save(Student s) {
        repo.save(s);
    }

    public void delete(int id) {
        repo.deleteById(id);
    }
}