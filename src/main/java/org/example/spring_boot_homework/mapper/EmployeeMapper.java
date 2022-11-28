package org.example.spring_boot_homework.mapper;

import org.example.spring_boot_homework.dto.EmployeeDtoRq;
import org.example.spring_boot_homework.entity.Employee;
import org.springframework.stereotype.Component;

@Component
public class EmployeeMapper {
    public Employee convertEmployeeRq(EmployeeDtoRq employeeDtoRq) {
        return new Employee(employeeDtoRq.getName(), employeeDtoRq.getAge(), employeeDtoRq.getSalary());
    }
}
