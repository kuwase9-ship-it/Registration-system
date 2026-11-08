package com.example.Registrationsystem.controller;

import com.example.Registrationsystem.model.Student;
import com.example.Registrationsystem.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("students", service.getAllStudents());
        model.addAttribute("student", new Student());
        return "index";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute Student student) {
        service.saveStudent(student);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable int id) {
        service.deleteStudent(id);
        return "redirect:/";
    }
}
