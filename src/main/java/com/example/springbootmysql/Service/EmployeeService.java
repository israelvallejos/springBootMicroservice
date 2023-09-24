package com.example.springbootmysql.Service;
import com.example.springbootmysql.Dtos.EmployeeDTO;
import com.example.springbootmysql.Model.Employee;
import java.util.ArrayList;
import java.util.List;
import com.example.springbootmysql.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeService(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    public List<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return mapToDTOList(employees);
    }

    public EmployeeDTO updateEmployee(Long id, EmployeeDTO updatedEmployeeDTO) {

        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found with ID: " + id));
        existingEmployee.setFirstName(updatedEmployeeDTO.getFirstName());
        existingEmployee.setLastName(updatedEmployeeDTO.getLastName());
        existingEmployee.setEmail(updatedEmployeeDTO.getEmail());
        existingEmployee.setPhoneNumber(updatedEmployeeDTO.getPhoneNumber());
        existingEmployee.setHireDate(updatedEmployeeDTO.getHireDate());
        existingEmployee.setJobTitle(updatedEmployeeDTO.getJobTitle());
        existingEmployee.setSalary(updatedEmployeeDTO.getSalary());
        existingEmployee.setDepartment(updatedEmployeeDTO.getDepartment());


        Employee updatedEmployee = employeeRepository.save(existingEmployee);


        return mapToDTO(updatedEmployee);
    }
    public EmployeeDTO createEmployee(EmployeeDTO employeeDTO) {
        Employee newEmployee = new Employee();
        newEmployee.setFirstName(employeeDTO.getFirstName());
        newEmployee.setLastName(employeeDTO.getLastName());
        newEmployee.setEmail(employeeDTO.getEmail());
        newEmployee.setPhoneNumber(employeeDTO.getPhoneNumber());
        newEmployee.setHireDate(employeeDTO.getHireDate());
        newEmployee.setJobTitle(employeeDTO.getJobTitle());
        newEmployee.setSalary(employeeDTO.getSalary());
        newEmployee.setDepartment(employeeDTO.getDepartment());


        Employee createdEmployee = employeeRepository.save(newEmployee);

        return mapToDTO(createdEmployee);
    }

    public void deleteEmployee(Long id) {
        Employee existingEmployee = employeeRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Employee not found with ID: " + id));

        employeeRepository.delete(existingEmployee);
    }

    private List<EmployeeDTO> mapToDTOList(List<Employee> employees) {
        List<EmployeeDTO> dtos = new ArrayList<>();
        for (Employee employee : employees) {
            dtos.add(mapToDTO(employee));
        }
        return dtos;
    }

    private EmployeeDTO mapToDTO(Employee employee) {
        EmployeeDTO dto = new EmployeeDTO();
        dto.setFirstName(employee.getFirstName());
        dto.setLastName(employee.getLastName());
        dto.setEmail(employee.getEmail());
        dto.setHireDate(employee.getHireDate());
        dto.setJobTitle(employee.getJobTitle());
        dto.setDepartment(employee.getDepartment());
        dto.setPhoneNumber(employee.getPhoneNumber());
        dto.setSalary(employee.getSalary());
        return dto;
    }
}


