package com.atuka.manageemplyee.Controller;

import com.atuka.manageemplyee.Model.EmployeeModel;
import com.atuka.manageemplyee.Response.EmployeeResponse;
import com.atuka.manageemplyee.Service.EmployeeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {
    private final EmployeeService employeeService;


    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping
    public EmployeeResponse getAllEmployee() {
        return employeeService.getEmployee();
    }

    @GetMapping("{id}")
    public EmployeeResponse getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployeeById(id);
    }


}
