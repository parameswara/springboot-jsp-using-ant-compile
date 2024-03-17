package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.example.demo.dao.EmployeeDao;
import com.example.demo.entity.Employee;
import com.example.demo.exception.RecordNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public interface EmployeeService {

    public List<Employee> getAllEmployees();

    public Employee getEmployeeById(Long id) throws RecordNotFoundException;

    public Employee createOrUpdateEmployee(Employee entity) throws RecordNotFoundException;

    public void deleteEmployeeById(Long id) throws RecordNotFoundException;

}
