package com.custom;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeExample {
    public static void main(String[] args) {
        //1
        List.of(
                new Employee(1,"Satish","HR",50000.0),
                new Employee(2,"Bob","HR",60000.0),
                new Employee(3,"Parvin","IT",70000.0),
                new Employee(4,"Karuna","IT",75000.0),
                new Employee(5,"Lisa","Finance",80000.0),
                new Employee(6,"Linda","Finance",90000.0),
                new Employee(7,"Jeevan","IT",65000.0),
                new Employee(8,"Tarun","HR",75000.0)
        ).stream().collect(Collectors.groupingBy(Employee::department, Collectors.maxBy(Comparator.comparing(Employee::salary)))
        ).entrySet()
                .forEach(e-> System.out.println(e.getValue()));
        System.out.println("-----------------------------");
        System.out.println("use collectingAndThen");

        Map<String, Employee> highestPaidByDepartment = List.of(
                new Employee(1, "Satish", "HR", 50000.0),
                new Employee(2, "Bob", "HR", 60000.0),
                new Employee(3, "Parvin", "IT", 70000.0),
                new Employee(4, "Karuna", "IT", 75000.0),
                new Employee(5, "Lisa", "Finance", 80000.0),
                new Employee(6, "Linda", "Finance", 90000.0),
                new Employee(7, "Jeevan", "IT", 65000.0),
                new Employee(8, "Tarun", "HR", 75000.0)
        ).stream().collect(Collectors.groupingBy(Employee::department,
                Collectors.collectingAndThen(
                        Collectors.maxBy(Comparator.comparing(Employee::salary)),
                        optionalEmployee -> optionalEmployee.orElse(null)
                )));
        highestPaidByDepartment.forEach((department, employee) ->{
            System.out.println("Department : "+department);
            System.out.println("Highest Paid Employee: : "+employee);
        });

    }
}
