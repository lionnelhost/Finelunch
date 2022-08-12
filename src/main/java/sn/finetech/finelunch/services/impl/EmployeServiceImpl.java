package sn.finetech.finelunch.services.impl;

import org.springframework.stereotype.Service;
import sn.finetech.finelunch.models.Employee;
import sn.finetech.finelunch.repositories.EmployeeRepository;
import sn.finetech.finelunch.services.EmployeService;

import java.time.LocalDate;
import java.util.List;

@Service
public class EmployeServiceImpl implements EmployeService {

    EmployeeRepository employeeRepository;

    public EmployeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }


    @Override
    public Employee createEmployee(Employee employee) {
        employee.setMatricule(gen_emp_mat(10));
        return employee;
    }

    @Override
    public List<Employee> findByLastname(String lastname) {
        return employeeRepository.findByLastname(lastname);
    }

    @Override
    public List<Employee> findByFirstname(String firstname) {
        return employeeRepository.findByFirstname(firstname);
    }

    @Override
    public List<Employee> findByPhone(String phone) {
        return employeeRepository.findByPhone(phone);
    }

//    @Override
//    public List<Employee> findBirthdateGratherThan(LocalDate birthday) {
//        return employeeRepository.findBirthdateGratherThan(birthday);
//    }

    public static String gen_emp_mat(int n) {
        String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
                + "0123456789"
                + "abcdefghijklmnopqrstuvxyz";
        StringBuilder sb = new StringBuilder(n);
        for (int i = 0; i < n; i++) {
            int index = (int) (AlphaNumericString.length() * Math.random());
            sb.append(AlphaNumericString.charAt(index));
        }
        return "EMP-"+ sb;
    }



//    public static boolean phone_is_valid(String phone){
//        final String PHONE_REGEX = '/^(\+221)?(77|78|75|70|76)[0-9]{7}$/mg';
//        Pattern pattern = Pattern.compile(PHONE_REGEX);
//        Matcher matcher = pattern.matcher(phone);
//        if ( matcher.matches()) {
//            return true;
//        }else {
//            return false;
//        }
//    }
}
