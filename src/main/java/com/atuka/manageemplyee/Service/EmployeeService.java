package com.atuka.manageemplyee.Service;

import com.atuka.manageemplyee.Model.EmployeeModel;
import com.atuka.manageemplyee.Repository.EmployeeRepository;
import com.atuka.manageemplyee.Response.EmployeeResponse;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private ModelMapper modelMapper;

    public EmployeeResponse getEmployeeById(Integer id) {
        Optional<EmployeeModel> employeeModel = employeeRepository.findById(id);
        return modelMapper.map(employeeModel, EmployeeResponse.class);
    }

    public EmployeeResponse getEmployee() {
        List<EmployeeModel> employeeModel = employeeRepository.findAll();
        return (modelMapper.map(employeeModel, EmployeeResponse.class));
    }

    public void createEmployee(EmployeeModel employeeModel) {
        employeeRepository.save(employeeModel);
    }


}
