package com.microservice.employee.microservice_employee.controller;

import com.microservice.employee.microservice_employee.dto.ResponseDto;
import com.microservice.employee.microservice_employee.entity.Employe;
import com.microservice.employee.microservice_employee.service.EmployeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employe")
public class EmployeController {
    private EmployeService employeService;

    @PostMapping
    public ResponseEntity<Employe> saveEmploye(@RequestBody Employe employe){
        Employe savedEmploye = employeService.saveEmploye(employe);
        return new ResponseEntity<>(savedEmploye, HttpStatus.CREATED);
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseDto> getEmploye(@PathVariable("id") Long employeId){
        ResponseDto responseDto = employeService.getEmploye(employeId);
        return ResponseEntity.ok(responseDto);
    }
}
