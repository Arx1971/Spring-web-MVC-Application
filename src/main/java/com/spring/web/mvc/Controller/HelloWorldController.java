package com.spring.web.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;


/*@RequestMapping maps HTTP requests to handler methods of MVC and REST controllers.
* In Spring MVC applications, the RequestDispatcher (Front Controller)
  servlet is responsible for routing incoming HTTP requests to handler methods of controllers.
*
* */

@Controller
@RequestMapping("/home") // Controller level mapping to resolve the ambiguity issue
public class HelloWorldController {

    @RequestMapping("/showForm") // showForm was mapped in ControllerMappingDemo class, which throw ambiguity exception
    public String showForm() {
        return "helloWorld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloWorld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String getStudentName(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = "Student Name: " + name;

        model.addAttribute("message", result);

        return "helloWorld";

    }

    // Reading HTML Form Data with @RequestParam Annotation

    @RequestMapping("/processFormVersionThree")
    public String getStudentAddress(@RequestParam("studentName") String name, HttpServletRequest request, Model model) {

        name = name.toUpperCase();

        String result = "Student Name: " + name;

        model.addAttribute("message", result);

        return "helloWorld";

    }

}
