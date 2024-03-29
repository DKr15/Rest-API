package com.example.demo.controller;

import com.example.demo.model.Employee;
import com.example.demo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DemoController {
    @Autowired
    DemoService demoService;

    @GetMapping("/employees")
    List<Employee> sayHello() {
        return demoService.displayEmp();
    }

}
