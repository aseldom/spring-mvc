package com.zaurtregulov.spring.mvc;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {

//    @GetMapping("/")
    public String showFirstView() {
        return "first-view";
    }

    @GetMapping("/askDetails")
    public String askDetails() {
        return "ask-employee-details";
    }

//    @GetMapping("/showDetails")
    public String showDetails(HttpServletRequest request, Model model) {
        String name = request.getParameter("employeeName");
        name = "Mr " + name;
        model.addAttribute("nameAttribute", name);
        return "show-emp-details-view";
    }

    @GetMapping("/showDetails")
    public String showDetails(@RequestParam("employeeName") String empName, Model model) {
        String name = "Mr. " + empName;
        model.addAttribute("nameAttribute", name);
        return "show-emp-details-view";
    }
}
