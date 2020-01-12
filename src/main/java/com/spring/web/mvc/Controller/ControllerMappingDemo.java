package com.spring.web.mvc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerMappingDemo {

    @RequestMapping("/showForm")
    public String displayTheForm() {

        return "helloWorldTest";
    }

}
