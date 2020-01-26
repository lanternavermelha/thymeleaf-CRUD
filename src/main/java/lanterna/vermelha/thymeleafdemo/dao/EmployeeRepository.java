package lanterna.vermelha.thymeleafdemo.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lanterna.vermelha.thymeleafdemo.entity.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//add a method to sort by last name
	public List<Employee> findAllByOrderByLastNameAsc();
}


