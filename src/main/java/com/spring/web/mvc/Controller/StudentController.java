package com.spring.web.mvc.Controller;

import com.spring.web.mvc.Model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {


    @RequestMapping("/showForm")
    public String showFrom(Model model) {

        Student newStudent = new Student();

        model.addAttribute("student", newStudent);

        return "student-form";
    }

    @RequestMapping("/processForm")
    public String processForm(@ModelAttribute("student") Student newStudent) {

        return "student-confirmation";

    }


}
