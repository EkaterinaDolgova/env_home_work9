package sky.pro.env_home_work9.service;

import org.springframework.stereotype.Service;
import sky.pro.env_home_work9.domain.Employee;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final List <Employee>  employees = new ArrayList(List.of(
            new Employee("Петров Петр Петрович", 1, 20000),
            new Employee("Иванов Иван Иванович", 2, 30000),
            new Employee("Сидоров Степан Геннадьевич", 1, 50000),
            new Employee("Степашкин Иван Федорович", 3, 10000),
            new Employee("Петров Илья Иванович", 4, 100000),
            new Employee("Арбузов Андрей Александрович", 5, 40000),
            new Employee("Арбузов Артем Александрович", 5, 45000),
            new Employee("Цветков Максим Викторович", 3, 50000),
            new Employee("Цветков Алексей Петрович", 1, 70000),
            new Employee("Симбирцев Михаил Андреевич", 4, 60000)
    ));

    @Override
    public List<Employee> getEmployeeList() {
        return employees;
    }

   @Override
    public String amount(Integer department) {
        int costAmount = 0;
        double averageSalary = 0;
       //Выводит все номера отдела
     //  final List<Integer> departments = employees.stream().map(e->{return e.getDepartment();}).collect(Collectors.toList());
     //  return departments;
//Поиск по отделу и выдает список сотрудников
  /*     final List<Employee> departments = employees.stream()
                       .filter(e->e.getDepartment()==department)
            .collect(Collectors.toList());
       return departments;*/
       final Integer departments = employees.stream()
               .filter(e->e.getDepartment()==department).mapToInt(e -> e.getSalary()).sum();
       final Integer count = Math.toIntExact(employees.stream()
               .filter(e -> e.getDepartment() == department).count());
       costAmount =departments*30;
       averageSalary = departments / count;
       return "Сумма затрат на зарплаты в месяц: " + costAmount + "р. :" + department
               + " Среднее значение зарплат: " + averageSalary + "р. в отделе № ";

    }
}
