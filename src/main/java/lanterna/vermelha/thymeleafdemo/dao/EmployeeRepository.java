package lanterna.vermelha.thymeleafdemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import lanterna.vermelha.thymeleafdemo.entity.Employee;

//@RepositoryRestResource(path="members")
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	//no code needed
}
