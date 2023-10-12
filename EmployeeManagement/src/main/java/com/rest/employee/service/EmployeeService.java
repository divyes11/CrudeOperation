package com.rest.employee.service;

import com.rest.employee.entity.Employee;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {


//    call third-parti api

//    add employee
    public void saveEmployee(Employee employee);

//   get all employee
    public List<Employee> getAllEmployee();

//    get single employee
    public Optional<Employee> getEmployeeById(int id);

//    update employee
    public void updateEmployee(Employee employee);

    //    Delete Employee
    public void deleteEmployee(int id);
}

