package com.example.demo.service;

import com.example.demo.model.Employee;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Service
@Configuration
public class DemoService {
    @Value("${employee.name}")
    String friendName;

    @Value("${employee.age}")
    String age;

    public List<Employee> displayEmp() {
        List<Employee> allEmp = new ArrayList<>();
        allEmp.add(new Employee("Dileep", 1, 1000));
        allEmp.add(new Employee("David", 2, 2000));
        allEmp.add(new Employee("Paul", 3, 3000));
        allEmp.add(new Employee("Smith", 4, 4000));
        allEmp.add(new Employee("David", 5, 1500));
        allEmp.add(new Employee("Nasir", 6, 1200));

        //allEmp.sort((e1, e2) -> e1.getSalary() > e2.getSalary() ? 1 : -1);

        allEmp.sort(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary));
        System.out.println("Read from property file ::" + friendName + " " + age);
        return allEmp;
    }
}
