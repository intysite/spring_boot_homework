package org.example.spring_boot_homework.dao;

import org.example.spring_boot_homework.entity.Employee;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class EmployeeDao {
    private Map<Integer, Employee> employees = new HashMap<>();
    private Integer employeeId = 1;

    public void createEmployee(Employee employee) {
        employee.setId(employeeId);
        employees.put(employeeId, employee);
        employeeId++;
    }

    public void deleteEmployee(Integer id) {
        employees.remove(id);
    }

    public Employee getEmployee(Integer id) {
        return employees.get(id);
    }

    public void patchEmployee(Employee employee) {
        employees.put(employee.getId(), employee);
    }
}
