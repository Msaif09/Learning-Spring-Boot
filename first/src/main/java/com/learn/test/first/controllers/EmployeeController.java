package com.learn.test.first.controllers;

//OPERATIONS
//POST /
//GET /
//DELETE /employee/{id}


import com.learn.test.first.dto.EmployeeDTO;
import com.learn.test.first.services.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping(path = "employees")
public class EmployeeController {

    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    //mandatory to pass id
    @GetMapping(path = "/{id}")
    public EmployeeDTO getEmployeeById(@PathVariable("id") Long id){
        return employeeService.getEmployeeById(id);
    }


    //optional to pass sortBy
    //you can pass multiple params
//    @GetMapping
//    public String getData(@PathParam("sortBy") String sortBy ,
//                          @PathParam("limit") Integer limit){
//        return "Hello " + sortBy + " " + limit;
//    }

    @PostMapping
    public EmployeeDTO createNewEmployee(@RequestBody EmployeeDTO employeeDTO){
        return employeeService.addEmployee(employeeDTO);
    }

    @GetMapping
    public List<EmployeeDTO> getAllEmployees(){
        return employeeService.getAllEmployees();
    }

    @DeleteMapping(path = "/{id}")
    public boolean deleteEmployeeById(@PathVariable("id") Long id){
        return employeeService.deleteEmployeeById(id);
    }

    

}
