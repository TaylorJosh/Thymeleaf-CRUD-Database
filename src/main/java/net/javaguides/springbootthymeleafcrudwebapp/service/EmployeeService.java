package net.javaguides.springbootthymeleafcrudwebapp.service;

import net.javaguides.springbootthymeleafcrudwebapp.model.Employee;
import org.springframework.data.domain.Page;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);
    Employee getEmployeeById(long id);
    void deleteEmployeeById(long id);
    Page<Employee> findPaginated(int pageNumber, int pageSize, String sortField, String sortDirection);
}
