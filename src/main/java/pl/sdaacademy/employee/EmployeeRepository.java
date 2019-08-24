package pl.sdaacademy.employee;

import java.util.List;

public interface EmployeeRepository {

    List<Employee> findAll();

    List<Employee> sortByAge();
}
