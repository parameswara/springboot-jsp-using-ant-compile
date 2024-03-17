package com.example.demo.controller;

import com.example.demo.entity.Employee;
import com.example.demo.exception.RecordNotFoundException;
import com.example.demo.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/")
    public String getAllEmployees(Model model) {
        List<Employee> list = service.getAllEmployees();
        model.addAttribute("name", "Parameswara Rao Tadisetti");
        //model.addAttribute("listEmployees", list);
        return "index";
    }

    @GetMapping("/list")
    public String showEmployee(Model model) {
        List<Employee> list = service.getAllEmployees();
        model.addAttribute("employee", service.getAllEmployees());
        model.addAttribute("employee", new Employee(1L,"Parameswara Rao","Tadisetti","parameswararaot@gmail.com"));
        return "listEmployee";
    }
    @GetMapping("/addEmployee")
    public String showAddTodoPage(Model model) {
        //model.addAttribute("employee", new Employee(1L,"Parameswara Rao","Tadisetti","parameswararaot@gmail.com")s);
        model.addAttribute("employee", new Employee());
        return "editEmployee";
    }
    @PostMapping("/addEmployee")
    public String addTodo(@ModelAttribute("employee") Employee employee, BindingResult result) throws RecordNotFoundException {
        if (result.hasErrors()) {
            return "index";
        }
        service.createOrUpdateEmployee(employee);
        return "redirect:/list";
    }

    @GetMapping("/showNewEmployeeForm")
    public String showNewEmployeeForm(Model model) {
        Employee employee = new Employee();
        model.addAttribute("employee", employee);
        return "new_employee";
    }

    @GetMapping("/showFormForUpdate/{id}")
    public String showFormForUpdate(@PathVariable(value = "id") Long id, Model model) throws RecordNotFoundException {
        Employee employee = service.getEmployeeById(id);
        model.addAttribute("employee", employee);
        return "update_employee";
    }

    @PostMapping("/saveEmployee")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) throws RecordNotFoundException {
        service.createOrUpdateEmployee(employee);
        return "redirect:/";
    }

    @DeleteMapping("/deleteEmployee/{id}")
    public String deleteEmployeeById(@PathVariable("id") Long id) throws RecordNotFoundException {
        service.deleteEmployeeById(id);
        return "redirect:/";
    }
}
