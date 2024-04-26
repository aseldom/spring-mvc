package com.zaurtregulov.spring.mvc;

import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MyController2 {

    @GetMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @GetMapping("/askDetails2")
    public String askDetails(Model model) {
        model.addAttribute("employee", new Employee());
        return "ask-employee-details2";
    }


    @PostMapping("/showDetails2")
    public String showDetails(@Valid @ModelAttribute("employee") Employee emp, BindingResult bindingResult) {
        if(bindingResult.hasErrors()) {
            return "ask-employee-details2";
        } else {
            return "show-emp-details-view2";
        }
    }
}
