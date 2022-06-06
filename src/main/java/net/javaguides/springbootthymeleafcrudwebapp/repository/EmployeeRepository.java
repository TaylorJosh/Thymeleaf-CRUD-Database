package net.javaguides.springbootthymeleafcrudwebapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{


}