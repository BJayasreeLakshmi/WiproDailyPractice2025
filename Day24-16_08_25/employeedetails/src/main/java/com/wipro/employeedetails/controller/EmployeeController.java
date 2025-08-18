package com.wipro.employeedetails.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.ui.Model;

import com.wipro.employeedetails.entity.Employee;
import com.wipro.employeedetails.service.EmployeeService;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping("/list")
    public String listEmployees(Model model) {
        model.addAttribute("employees", employeeService.getAll());
        return "list";
    }
	@GetMapping("/search")
	public String searchByName(@RequestParam String name, Model model) {
	    model.addAttribute("employees", employeeService.getByName(name));
	    return "list";
	}
	@GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "add";
    }
	
	 @PostMapping("/add")
	    public String saveEmployee(@ModelAttribute Employee emp) {
		 employeeService.create(emp);
	        return "redirect:/employees/list";
	 }

	 @GetMapping("/edit/{id}")
	 public String showEditForm(@PathVariable int id, Model model) {
	        model.addAttribute("employee", employeeService.getById(id));
	        return "edit";
	  }
	 
	 @PostMapping("/update/{id}")
	    public String updateEmployee(@PathVariable int id, @ModelAttribute Employee emp) {
		 employeeService.update(id, emp);
	        return "redirect:/employees/list";
	  }

	 @GetMapping("/delete/{id}")
	 public String deleteEmployee(@PathVariable int id) {
		 employeeService.delete(id);
	        return "redirect:/employees/list";
	  }
	
	

}
