package lanterna.vermelha.thymeleafdemo.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import lanterna.vermelha.thymeleafdemo.model.Employee;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
	
	// load employee data
	private List<Employee> theEmployees;
	
	@PostConstruct
	private void loadData() {
		//create employees
		Employee empl1 = new Employee(1,"Filipe", "Figueira", "f_figueira@hotmail.com");
		Employee empl2 = new Employee(2,"Silvia", "Louro", "silouro@rtp.pt");
		Employee empl3 = new Employee(3,"Macacas", "Malucas", "macacas_malucas@hotmail.com");
		//create the list
		theEmployees  = new ArrayList<>();
		
		//add to the list
		theEmployees.add(empl1);
		theEmployees.add(empl2);
		theEmployees.add(empl3);
	}
	
	//add mapping for "/list"
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		//addto the spring model
		theModel.addAttribute("employees", theEmployees);
		
		return "list-employees";
	}
	

}
