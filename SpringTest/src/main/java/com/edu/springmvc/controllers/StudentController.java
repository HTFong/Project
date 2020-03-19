package com.edu.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServlet;

@Controller
@RequestMapping("/studentHome")
public class StudentController {

    @GetMapping("")
    public String showForm() {
        return "student-form";
    }

    @PostMapping()
    public String showInfo(HttpServlet request, ModelMap modelMap) {
        String nameData = request.getInitParameter("name");
        String gpaData = request.getInitParameter("gpa");
        String majorData = request.getInitParameter("major");
        modelMap.addAttribute("name",nameData);
        modelMap.addAttribute("gpa",gpaData);
        modelMap.addAttribute("major",majorData);
        return "student-info";
    }
}
