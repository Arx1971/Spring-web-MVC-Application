package com.spring.web.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {

    @RequestMapping("/showForm")
    public String showForm() {
        return "helloWorld-form";
    }

    @RequestMapping("/processForm")
    public String processForm() {
        return "helloWorld";
    }

    @RequestMapping("/processFormVersionTwo")
    public String shout(HttpServletRequest request, Model model) {

        String name = request.getParameter("studentName");

        name = name.toUpperCase();

        String result = name + "! Did You get the email";

        model.addAttribute("message", result);

        return "helloWorld";

    }

}
