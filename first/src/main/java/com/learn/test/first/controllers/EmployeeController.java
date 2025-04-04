package com.learn.test.first.controllers;

//OPERATIONS
//POST /
//GET /
//DELETE /employee/{id}


import com.learn.test.first.dto.EmployeeDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class EmployeeController {

    @GetMapping(path = "/employees")
    public EmployeeDTO getEmployee(){
        return new EmployeeDTO(9L,"Mohammad Saif", LocalDate.of(2023,7,15),true);
    }
}
