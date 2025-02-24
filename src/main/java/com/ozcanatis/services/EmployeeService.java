package com.ozcanatis.services;

import com.ozcanatis.model.Employee;
import com.ozcanatis.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    public List<Employee> getEmployeeList() {
        employeeRepository.getAllEmployeeList();
return employeeRepository.getAllEmployeeList();

    }

}
