package org.example.spring_boot_homework.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class EmployeeDtoRq {
    private String name;
    private Integer age;
    private Integer salary;
}
