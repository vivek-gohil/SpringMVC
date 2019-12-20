package com.mindgate.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

	@RequestMapping("/employeeForm")
	public String showEmployeeForm() {
		return "employee-form";
	}
	
	@RequestMapping("/employeeConfirmation")
	public String displayConfirmationPage()
	{
		return "employee-confirmation";
		
	}
}
