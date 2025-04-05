package com.learn.test.first.controllers;

//OPERATIONS
//POST /
//GET /
//DELETE /employee/{id}


import com.learn.test.first.dto.EmployeeDTO;
import jakarta.websocket.server.PathParam;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;

@RestController
public class EmployeeController {


    //mandatory to pass id
    @GetMapping(path = "/employees/{id}")
    public EmployeeDTO getEmployee(@PathVariable("id") Long id){
        return new EmployeeDTO(id,"Mohammad Saif", LocalDate.now(),true);
    }


    //optional to pass sortBy
    //you can pass multiple params
    @GetMapping(path = "/employee")
    public String getData(@PathParam("sortBy") String sortBy ,
                          @PathParam("limit") Integer limit){
        return "Hello " + sortBy + " " + limit;
    }
}
