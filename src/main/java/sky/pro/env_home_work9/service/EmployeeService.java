package sky.pro.env_home_work9.service;
import org.springframework.stereotype.Service;
import sky.pro.env_home_work9.domain.Employee;
import java.util.List;

@Service
public interface EmployeeService  {
    List<Employee> getEmployeeList();
    String amount(Integer department);
}
