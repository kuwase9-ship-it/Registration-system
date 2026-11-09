package com.example.Registrationsystem.repository;

import com.example.Registrationsystem.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {
}