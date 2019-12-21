package com.mindgate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mindgate.model.Employee;

@Controller
@RequestMapping("/emp")
public class EmployeeController {

	@RequestMapping("/employeeForm")
	public String showEmployeeForm(Model model) {

		Employee employee = new Employee();

		model.addAttribute("empObject", employee);
		return "employeeForm";
	}

	@RequestMapping("/confirmDetails")
	public String showConfirmationPage(@ModelAttribute("empObject") Employee employee, ModelMap model) {
		System.out.println(employee);
		model.addAttribute("empObject", employee);
		return "employeeDetails";
	}
}
