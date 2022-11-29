package org.example.spring_boot_homework.service;

import org.example.spring_boot_homework.dao.EmployeeDao;
import org.example.spring_boot_homework.dto.EmployeeDtoRq;
import org.example.spring_boot_homework.entity.Employee;
import org.example.spring_boot_homework.mapper.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
    private EmployeeMapper employeeMapper;
    private EmployeeDao employeeDao;

    @Autowired
    public EmployeeService(EmployeeMapper employeeMapper, EmployeeDao employeeDao) {
        this.employeeMapper = employeeMapper;
        this.employeeDao = employeeDao;
    }

    public void createEmployee(EmployeeDtoRq employeeDtoRq) {
        employeeDao.createEmployee(employeeMapper.convertEmployeeRq(employeeDtoRq));
    }

    public void deleteEmployee(Integer id) {
        employeeDao.deleteEmployee(id);
    }

    public Employee getEmployee(Integer id) {
        return employeeDao.getEmployee(id);
    }

    public void patchEmployee(EmployeeDtoRq employeeDtoRq) {
        employeeDao.patchEmployee(employeeMapper.convertEmployeeRq(employeeDtoRq));
    }
}
