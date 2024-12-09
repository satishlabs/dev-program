package com.custom;

import java.util.List;
import java.util.stream.Collectors;
//Suppose we have a List of employee Objects and
// we want to find out the employee from each department with highest salary

public record Employee(Integer id, String name, String department, Double salary) { }


