package sky.pro.env_home_work9.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import sky.pro.env_home_work9.domain.Employee;
import sky.pro.env_home_work9.service.EmployeeService;
import java.util.List;

@RestController
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }
    @GetMapping("/employee/list")
    public List<Employee> printEmployeeList() {
        return employeeService.getEmployeeList();
    }
    @GetMapping(path = "/employee/department-amount")
    public String employeeAmount(@RequestParam Integer department) {
        return employeeService.amount(department);
    }
    @GetMapping(path = "/employee/max-salary")
    public String employeeMaxSalary(@RequestParam Integer department) {
        return employeeService.maxSalary(department);
    }
    @GetMapping(path = "/employee/min-salary")
    public String employeeMinSalary(@RequestParam Integer department) {
        return employeeService.minSalary(department);
    }


}
