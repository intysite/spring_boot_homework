package org.example.spring_boot_homework.entity;

import lombok.Data;
import lombok.NonNull;

@Data
public class Employee {
    private Integer id;
    @NonNull
    private String name;
    @NonNull
    private Integer age;
    @NonNull
    private Integer salary;
}
