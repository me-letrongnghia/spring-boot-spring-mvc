package com.nghiale.springboot.thymeleafdemo.controller;

import com.nghiale.springboot.thymeleafdemo.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
public class StudentController {

    @GetMapping("/showStudentForm")
    public String showStudentForm(Model theModel) {

        Student theStudent = new Student();

        theModel.addAttribute("student", theStudent);

        return "student-form";
    }

    @PostMapping("/processStudentForm")
    public String processStudentForm(@ModelAttribute("student") Student theStudent) {

        return "student-confirmation";
    }
}
