package com.swagger.springboot.SpringBootSwaggerDocumentation.repositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.swagger.springboot.SpringBootSwaggerDocumentation.domain.Employee;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long>{
}