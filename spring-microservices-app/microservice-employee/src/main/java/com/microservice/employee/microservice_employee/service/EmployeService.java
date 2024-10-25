package com.microservice.employee.microservice_employee.service;

import com.microservice.employee.microservice_employee.dto.*;
import com.microservice.employee.microservice_employee.entity.Employe;
public interface EmployeService {
    Employe saveEmploye(Employe employe);
    ResponseDto getEmploye(Long employeId);
}
