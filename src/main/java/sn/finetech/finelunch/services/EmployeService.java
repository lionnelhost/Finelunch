package sn.finetech.finelunch.services;

import sn.finetech.finelunch.models.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeService {

    Employee createEmployee(Employee employee);
    List<Employee> findByLastname(String  lastname);
    List<Employee> findByFirstname(String  firstname);
    List<Employee> findByPhone(String  phone);

//    List<Employee> findBirthdateGratherThan(LocalDate  birthday);
}
