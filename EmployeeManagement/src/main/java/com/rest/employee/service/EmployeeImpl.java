package com.rest.employee.service;

import com.rest.employee.entity.Employee;
import com.rest.employee.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeImpl implements EmployeeService {
    @Autowired
    private EmployeeRepo employeeRepo;

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public List<Employee> getAllEmployee() {
        return employeeRepo.findAll();
    }

    @Override
    public Optional<Employee> getEmployeeById(int id) {
        return employeeRepo.findById(id);
    }

    @Override
    public void  updateEmployee(Employee employee) {
        employeeRepo.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepo.deleteById(id);
    }
}
