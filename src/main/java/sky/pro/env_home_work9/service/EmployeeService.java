package sky.pro.env_home_work9.service;

import org.springframework.stereotype.Service;
import sky.pro.env_home_work9.domain.Employee;

import java.util.List;
import java.util.Comparator;

@Service
public interface EmployeeService {
    List<Employee> getEmployeeList();

    String amount(Integer department);

    String maxSalary(Integer department);

    String minSalary(Integer department);
}
