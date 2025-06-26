package com.gabrielsouzas.ems.service.impl;

import com.gabrielsouzas.ems.dto.EmployeeDto;
import com.gabrielsouzas.ems.entity.Employee;
import com.gabrielsouzas.ems.exception.ResourceNotFoundException;
import com.gabrielsouzas.ems.mapper.EmployeeMapper;
import com.gabrielsouzas.ems.repository.EmployeeRepository;
import com.gabrielsouzas.ems.service.EmployeeService;

import java.util.List;
// import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {

    private EmployeeRepository employeeRepository;

    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }

    @Override
    public List<EmployeeDto> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();
        return employees.stream()
                .map(EmployeeMapper::mapToEmployeeDto)
                .toList();

        // Longer version with Collectors:
        // return employees.stream()
        // .map((employee) -> EmployeeMapper.mapToEmployeeDto(employee))
        // .collect(Collectors.toList());
    }

    @Override
    public EmployeeDto updateEmployee(Long employeeId, EmployeeDto updatedEmployeeDto) {
        Employee existingEmployee = employeeRepository.findById(employeeId)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + employeeId));

        // Update fields
        existingEmployee.setFirstName(updatedEmployeeDto.getFirstName());
        existingEmployee.setLastName(updatedEmployeeDto.getLastName());
        existingEmployee.setEmail(updatedEmployeeDto.getEmail());

        Employee updatedEmployee = employeeRepository.save(existingEmployee);
        return EmployeeMapper.mapToEmployeeDto(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long employeeId) {
        if (!employeeRepository.existsById(employeeId)) {
            throw new ResourceNotFoundException("Employee not found with id: " + employeeId);
        }
        employeeRepository.deleteById(employeeId);
    }
}
