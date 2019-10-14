package com.employee.dao;

import org.springframework.stereotype.Repository;

import com.employee.model.Employee;
import com.employee.model.Employees;

@Repository
public class EmployeeDAO
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "Subham", "Sahu", "subhamkumar.official@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Korai", "Purusottam", "kpurusottam@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Deepak", "Bali", "deepak@gmail.com"));
    }
     
    public Employees getAllEmployees()
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}