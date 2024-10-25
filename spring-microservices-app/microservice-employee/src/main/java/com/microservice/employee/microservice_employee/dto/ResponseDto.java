package com.microservice.employee.microservice_employee.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class ResponseDto {
    private DepartmentDto department;
    private EmployeDto employe;
}
