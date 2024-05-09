package com.atuka.manageemplyee.configuration;

import com.atuka.manageemplyee.Service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public EmployeeService employeeBean(){
        return new EmployeeService();
    }
    @Bean
    public ModelMapper ModelMapperBean(){
        return new ModelMapper();
    }
}
