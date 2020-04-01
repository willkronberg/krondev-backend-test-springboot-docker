package dev.kron.backend.controller;

import dev.kron.backend.model.Employee;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;

@RestController
public class EmployeeController
{
    @RequestMapping("/")
    public List<Employee> getEmployees()
    {
        List<Employee> employeesList = new ArrayList<Employee>();
        employeesList.add(new Employee(1,"Will","Kronberg","kron.dev@icloud.com"));
        return employeesList;
    }
}
