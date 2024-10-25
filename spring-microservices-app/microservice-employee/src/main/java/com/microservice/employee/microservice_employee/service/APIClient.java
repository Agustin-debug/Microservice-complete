package com.microservice.employee.microservice_employee.service;

import com.microservice.employee.microservice_employee.dto.DepartmentDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "Department-service") //Cuando debo de asignarle sin Eureka andando, asigno url = "http://localhost:8082"
public interface APIClient {
    @GetMapping(value = "/api/departments/{id}")
    DepartmentDto getDepartmentById(@PathVariable("id") String departmentId);
}
