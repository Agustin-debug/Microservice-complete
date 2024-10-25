package com.microservice.employee.microservice_employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class EmployeDto {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
}