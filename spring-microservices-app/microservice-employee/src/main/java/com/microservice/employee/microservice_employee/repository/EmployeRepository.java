package com.microservice.employee.microservice_employee.repository;

import com.microservice.employee.microservice_employee.entity.Employe;
import org.springframework.data.jpa.repository.JpaRepository;
public interface EmployeRepository extends JpaRepository<Employe, Long>{
}
