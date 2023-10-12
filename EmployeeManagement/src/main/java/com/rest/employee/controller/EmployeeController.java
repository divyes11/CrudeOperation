package com.rest.employee.controller;

import com.netflix.discovery.EurekaClient;
import com.rest.employee.entity.CountryInfo;
import com.rest.employee.entity.Employee;
import com.rest.employee.external.service.Country;
import com.rest.employee.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

//   @Autowired
//    private EurekaClient eurekaClient;
    @Autowired
    private EmployeeService employeeService;

    @Autowired
    private final Country country;

    public EmployeeController(Country country) {
        this.country = country;
    }

    @GetMapping("/get-countries")
    ResponseEntity<List<CountryInfo>> getAllCountry(){
        List<CountryInfo> cl = country.getCountry();
        System.err.println(cl);
       return ResponseEntity.ok(cl);
    }

    @PostMapping("/add-employee")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok("employee saved Successfully.");
    }

    @GetMapping("/get-employees")
    public ResponseEntity<List<Employee>> getAllEmployee(){
        return ResponseEntity.ok(employeeService.getAllEmployee());
    }
    @GetMapping("/get-employee/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable int id){
        Optional<Employee> employee = employeeService.getEmployeeById(id);
        System.out.println("employee : "+employee);
        return employee.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());

    }

    @PostMapping("/update-employee")
    public ResponseEntity<String> updateEmployee(@RequestBody Employee employee){
        employeeService.saveEmployee(employee);
        return ResponseEntity.ok("Updated");
    }
    @DeleteMapping("/delete-employee/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable int id){
        employeeService.deleteEmployee(id);
        return ResponseEntity.ok("DELETED");
    }
}
