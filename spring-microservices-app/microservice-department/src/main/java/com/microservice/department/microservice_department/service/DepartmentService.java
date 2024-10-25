package com.microservice.department.microservice_department.service;

import com.microservice.department.microservice_department.entity.Department;
public interface DepartmentService {
    Department saveDepartment(Department department);
    Department getDepartmentById(Long departmentId);
}
