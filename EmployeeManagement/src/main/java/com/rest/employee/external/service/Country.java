package com.rest.employee.external.service;

import com.rest.employee.entity.CountryInfo;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@FeignClient(name = "name", url="https://restcountries.com/v3.1")
public interface Country {
    @GetMapping("/all")
    List<CountryInfo> getCountry();
}
