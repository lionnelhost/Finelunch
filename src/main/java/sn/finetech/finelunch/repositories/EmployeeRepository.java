package sn.finetech.finelunch.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import sn.finetech.finelunch.models.Employee;

import java.time.LocalDate;
import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

    List<Employee> findByLastname(String  lastname);
    List<Employee> findByFirstname(String  firstname);
    List<Employee> findByPhone(String  phone);

//    List<Employee> findBirthdateGratherThan(LocalDate  birthday);

}