package com.custom;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeExample1 {
    public static void main(String[] args) {
     record Employee(Integer id, String name, String department, Double salary) { }

        List<Employee> employees = List.of(
                new Employee(1, "A", "IT", 1000.0),
                new Employee(2, "B", "HR", 2000.0),
                new Employee(3, "C", "IT", 3000.0),
                new Employee(4, "D", "HR", 4000.0),
                new Employee(5, "E", "IT", 5000.0),
                new Employee(6, "F", "HR", 6000.0),
                new Employee(7, "G", "IT", 7000.0),
                new Employee(8, "H", "HR", 8000.0),
                new Employee(9, "I", "IT", 9000.0),
                new Employee(10, "J", "HR", 10000.0)
        );

     employees.stream()
             .collect(Collectors.groupingBy(Employee::department))
             .forEach((department, employeeList) ->{
                 Employee higestPaid = employeeList.stream()
                         .max(Comparator.comparing(Employee::salary))
                         .orElseThrow();
                 System.out.println("Department: "+department);
                 System.out.println("Highest Paid Employee: "+higestPaid.name());
             });
    }
}
