package org.example.spring_boot_homework.controller;

import org.example.spring_boot_homework.dto.EmployeeDtoRq;
import org.example.spring_boot_homework.entity.Employee;
import org.example.spring_boot_homework.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class MegaController {
    private EmployeeService employeeService;

    @Autowired
    public MegaController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @PostMapping(path = "/create_employee")
    public void createEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        employeeService.createEmployee(employeeDtoRq);
    }

    @DeleteMapping(path = "/delete_employee/{id}")
    public void deleteEmployee(@PathVariable Integer id) {
        employeeService.deleteEmployee(id);
    }

    @GetMapping(path = "/employee/{id}")
    public Employee getEmployee(@PathVariable Integer id) {
        return employeeService.getEmployee(id);
    }

    @PatchMapping(path = "/patch_employee")
    public void patchEmployee(@RequestBody EmployeeDtoRq employeeDtoRq) {
        employeeService.patchEmployee(employeeDtoRq);
    }
}
