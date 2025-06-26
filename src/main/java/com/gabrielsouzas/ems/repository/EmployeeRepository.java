package com.gabrielsouzas.ems.repository;

import com.gabrielsouzas.ems.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
