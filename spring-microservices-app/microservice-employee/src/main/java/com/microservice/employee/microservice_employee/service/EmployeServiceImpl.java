package com.microservice.employee.microservice_employee.service;

import com.microservice.employee.microservice_employee.dto.DepartmentDto;
import com.microservice.employee.microservice_employee.dto.ResponseDto;
import com.microservice.employee.microservice_employee.dto.EmployeDto;
import com.microservice.employee.microservice_employee.entity.Employe;
import com.microservice.employee.microservice_employee.repository.EmployeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
public class EmployeServiceImpl implements EmployeService{

    private EmployeRepository employeRepository;
    private APIClient apiClient;

    @Override
    public Employe saveEmploye(Employe employe) {
        return employeRepository.save(employe);
    }

    @Override
    public ResponseDto getEmploye(Long employeId) {
        ResponseDto responseDto = new ResponseDto();
        Employe employe = employeRepository.findById(employeId).get();
        EmployeDto employeDto = mapToEmploye(employe);
        responseDto.setEmploye(employeDto);

        DepartmentDto departmentDto = apiClient.getDepartmentById(employe.getDepartmentId());
        responseDto.setDepartment(departmentDto);

        return responseDto;
    }

    private EmployeDto mapToEmploye(Employe employe) {
        EmployeDto employeDto = new EmployeDto();
        employeDto.setId(employe.getId());
        employeDto.setFirstName(employe.getFirstName());
        employeDto.setLastName(employe.getLastName());
        employeDto.setEmail(employe.getEmail());
        return employeDto;
    }
}
