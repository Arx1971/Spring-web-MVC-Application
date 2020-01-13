package com.spring.web.mvc.Controller;

import com.spring.web.mvc.Model.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @RequestMapping("/process")
    public String process(Model model){
        model.addAttribute("customer", new Customer());
        return "main-menu";
    }


}
