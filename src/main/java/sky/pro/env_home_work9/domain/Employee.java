package sky.pro.env_home_work9.domain;

import java.util.Objects;
import java.util.Arrays;

public class Employee {

    private String fio;
    private int department;
    private int salary;
    static int counter;

    //Конструктор
    public Employee(String fio, int department, int salary) {
        this.fio = fio;
        this.department = department;
        this.salary = salary;
        counter++;
    }

    //Геттеры
    public String getFio() {
        return this.fio;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    //Сеттеры
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "ФИО: " + this.fio + " Отдел: " + this.department + " Зарплата: " + this.salary;
    }
}
