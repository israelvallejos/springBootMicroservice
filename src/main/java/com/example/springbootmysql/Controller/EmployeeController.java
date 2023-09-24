package com.example.springbootmysql.Controller;

import com.example.springbootmysql.Dtos.EmployeeDTO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.example.springbootmysql.Service.EmployeeService;

import java.util.List;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PutMapping("/{id}")
    public EmployeeDTO updateEmployee(@PathVariable Long id, @RequestBody EmployeeDTO updatedEmployeeDTO) {
        return employeeService.updateEmployee(id, updatedEmployeeDTO);
    }

    @PostMapping
    public EmployeeDTO createEmployee(@RequestBody EmployeeDTO newEmployeeDTO) {
        return employeeService.createEmployee(newEmployeeDTO);
    }

    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id) {
        employeeService.deleteEmployee(id);
    }


}
