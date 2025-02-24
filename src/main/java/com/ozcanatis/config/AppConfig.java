package com.ozcanatis.config;
import java.util.ArrayList;
import java.util.List;

import com.ozcanatis.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration

public class AppConfig {
    @Bean
    public List<Employee> EmployeeList() {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("1" , "ozcan" , "Atis"));
        employeeList.add(new Employee("2" , "tugrul" , "biber"));
        employeeList.add(new Employee("3" , "mertcan" , "karakoc"));
        employeeList.add(new Employee("4" , "burak" , "kiraz"));
        employeeList.add(new Employee("5" , "enes" , "ay"));
        return employeeList;
    }
}
